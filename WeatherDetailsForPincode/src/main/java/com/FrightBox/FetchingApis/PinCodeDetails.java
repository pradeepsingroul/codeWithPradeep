package com.FrightBox.FetchingApis;

import com.FrightBox.Model.WeatherDetails;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.time.LocalDate;

public class PinCodeDetails {

     static private JSONObject pinArray;
     static private JSONObject weatherObject;


    public static JSONArray returnPinDetailsArrays(int pin){  // trying to find the location via pincode
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://api.postalpincode.in/pincode/"+pin)
                .build();

        try {
            Response response = client.newCall(request).execute();
            return new JSONArray(response.body().string());

        } catch (IOException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
        return null;

    }
    public static JSONObject returnWeatherDetailsObject(String districk,LocalDate dateStamp){ // trying to get data from openweather Api
        OkHttpClient client = new OkHttpClient();

        Request request = new Request.Builder()
                .url("https://api.openweathermap.org/data/2.5/weather?q="+districk+"&appid=956df4d89fd7e25fc00ccab4ae566c5d&units=metric&lang=en&dt="+dateStamp) // Replace with your API endpoint
                .build();

        try {
            Response response = client.newCall(request).execute();
            return new JSONObject(response.body().string());

        } catch (IOException e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
        return null;

    }

    public static void getPinDetails(int pin) throws JSONException {
        pinArray = returnPinDetailsArrays(pin).getJSONObject(0).getJSONArray("PostOffice").getJSONObject(0);
//        String districk = (String)weatherArray.get("District");
//        WeatherLocation weatherLocation = new WeatherLocation();
//        weatherLocation.setPinCode(pin);
//        weatherLocation.setBlock((String)weatherArray.get("Block"));
//        weatherLocation.setDistrick((String)weatherArray.get("District"));
//        BigDecimal bigDecimal = new BigDecimal((Long) location.getJSONObject("coord").get("lon"));
//        Long lon = bigDecimal.longValue();
//        weatherLocation.setLongitude(lon);
//        BigDecimal bigDecimal2 = new BigDecimal((Long) location.getJSONObject("coord").get("lot"));
//        Long lat = bigDecimal.longValue();
//        weatherLocation.setLongitude(lat);

//        System.out.println(weatherLocation);

    }
    public static  void returnWeatherObject(String  districk,LocalDate dateStamp) throws  JSONException{
        weatherObject = returnWeatherDetailsObject(districk,dateStamp);
    }

    public static  JSONObject returnMainObjectFromWeather(String  districk) throws  JSONException{
        JSONObject mainWeatherObject = weatherObject.getJSONObject("main");
        return mainWeatherObject;
    }

    public static  JSONObject returnSysObjectFromWeather() throws  JSONException{
        JSONObject sysWeatherObject = weatherObject.getJSONObject("sys");
        return sysWeatherObject;
    }

    public static  JSONObject returnCoordObjectFromWeather() throws  JSONException{
        JSONObject coordWeatherObject = weatherObject.getJSONObject("coord");
        return coordWeatherObject;
    }

    public static  JSONObject returnWindObjectFromWeather(String  districk) throws  JSONException{
        JSONObject windWeatherObject = weatherObject.getJSONObject("wind");
        return windWeatherObject;
    }

    public static WeatherDetails getWeather(int pincode, LocalDate dateStamp){
        getPinDetails(pincode);
        returnWeatherObject((String) pinArray.get("District"),dateStamp);
        System.out.println(pinArray);
        System.out.println(weatherObject);
        return null;
    }

    public static JSONObject getPinArray() {
        return pinArray;
    }

    public static void setPinArray(JSONObject pinArray) {
        PinCodeDetails.pinArray = pinArray;
    }

    public static JSONObject getWeatherObject() {
        return weatherObject;
    }

    public static void setWeatherObject(JSONObject weatherObject) {
        PinCodeDetails.weatherObject = weatherObject;
    }
}
