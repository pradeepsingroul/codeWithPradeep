package com.FrightBox.FetchingApis;

import com.FrightBox.Model.Weather;
import com.FrightBox.Model.Location;
import lombok.AllArgsConstructor;
import lombok.Data;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;


@Data
@AllArgsConstructor
public class PinCodeDetail {

    static private JSONObject weatherObject; //we can say this is the parent object of weather details


    public static Location getLocationDetails(Integer pincode,LocalDate dateStamp){  // trying to find the location via pincode

        JSONObject pincodeDetails = null; //creating the null JSONObject to store the data which i will get from this api.

        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://api.opencagedata.com/geocode/v1/json?key=767d0ceffae94717836eadb18dee640a&q="+pincode+"&pretty=1")
                .build();
        try {
             Response response = client.newCall(request).execute();
             pincodeDetails = new JSONObject(response.body().string()).getJSONArray("results").getJSONObject(0); // assigning the pincode data whateven i am getting via api
        } catch (IOException e) {
            e.printStackTrace();
        }


        Location weatherLocation = new Location(); // just creating the Location option and setting the value.
        weatherLocation.setPinCode(pincode);
        weatherLocation.setDetail((String)pincodeDetails.get("formatted"));
        weatherLocation.setUrl((String) pincodeDetails.getJSONObject("annotations").getJSONObject("OSM").get("url"));
        weatherLocation.setLongitude((BigDecimal) pincodeDetails.getJSONObject("geometry").get("lng"));
        weatherLocation.setLattiTude((BigDecimal) pincodeDetails.getJSONObject("geometry").get("lat"));
        weatherLocation.setDateStamp(dateStamp);

        return weatherLocation;// just returnig the lcoation Object.


    }

    public static Weather getWeather(BigDecimal lat, BigDecimal lon, LocalDate dateStamp){ // trying to get weather data from openweather Api

        LocalDateTime localDateTime = dateStamp.atStartOfDay(); //in next 2 here i am converting the Date into unixTime because this api doen't accept date as argument.
        long unixTime = localDateTime.toEpochSecond(ZoneOffset.UTC);

        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder()
                .url("https://api.openweathermap.org/data/2.5/weather?lat="+lat+"&lon="+lon+"&dt="+unixTime+"&appid=956df4d89fd7e25fc00ccab4ae566c5d&units=metric") // Replace with your API endpoint
                .build();

        try {
            Response response = client.newCall(request).execute();
            weatherObject =  new JSONObject(response.body().string());
            System.out.println(weatherObject);
        } catch (IOException e) {
             e.printStackTrace();
        }


        JSONObject main = returnMainObjectFromWeather(); ; // subObject of weatherObject it will help to optimize our execution
        JSONObject sys =  returnSysObjectFromWeather();;// subObject of weatherObject it will help to optimize our execution
        JSONObject wind = returnWindObjectFromWeather(); // subObject of weatherObject it will help to optimize our execution


        Weather weather = new Weather(); // just creating an object of weather and setting the values;

        weather.setTemperature((BigDecimal) main.get("temp"));
        weather.setTemperature_max((BigDecimal) main.get("temp_max"));
        weather.setTemperature_min((BigDecimal) main.get("temp_min"));
        weather.setHumidity((Integer) main.get("humidity"));
        weather.setPressure((Integer) main.get("pressure"));
        weather.setCountry((String) sys.get("country"));
        weather.setSunset((Integer) sys.get("sunset"));
        weather.setSunrise((Integer) sys.get("sunrise"));
        weather.setWindDirection((Integer) wind.get("deg"));
        weather.setWindSpeed((BigDecimal) wind.get("speed"));
        weather.setCloud((String) weatherObject.getJSONArray("weather").getJSONObject(0).get("description"));


        return weather; // returning the weather object
    }




    public static  JSONObject returnMainObjectFromWeather() throws  JSONException{ // here getting the main object ehich is inside the weatherObject it will help to avoid repeatedely calling method
        return weatherObject.getJSONObject("main");
    }

    public static  JSONObject returnSysObjectFromWeather() throws  JSONException{// here getting the sys object ehich is inside the weatherObject it will help to avoid repeatedely calling method
        return weatherObject.getJSONObject("sys");
    }

    public static  JSONObject returnWindObjectFromWeather() throws  JSONException{// here getting the wind object ehich is inside the weatherObject it will help to avoid repeatedely calling method
        return weatherObject.getJSONObject("wind");
    }


}
