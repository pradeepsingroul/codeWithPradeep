package com.FrightBox.Services;

import com.FrightBox.Exceptions.WeatherExceptions;
import com.FrightBox.Exceptions.WeatherLocationExceptions;
import com.FrightBox.FetchingApis.PinCodeDetail;
import com.FrightBox.Model.SearchDTO;
import com.FrightBox.Model.Location;
import com.FrightBox.Model.Weather;
import com.FrightBox.Repository.LocationRepository;
import com.FrightBox.Repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class LocationServiceImpl implements LocaltionServices {

    @Autowired
    private LocationRepository lDao;

    @Autowired
    private WeatherRepository wDao;


    @Override
    public Weather getWeather(SearchDTO searchDTO) throws WeatherLocationExceptions, WeatherExceptions {
        Optional<Weather> optionalWeatherDetails = wDao.findById(searchDTO.getPincode()); // here i am checking that does weather details already exits with this pincode. if exits then just take the data from database and return
        if(optionalWeatherDetails.isPresent()){
            Weather weather = optionalWeatherDetails.get(); // getting the weather object.
            return weather;
        }else{

            Location weatherLocation = PinCodeDetail.getLocationDetails(searchDTO.getPincode(),searchDTO.getDateStamp());// getting the location object like lattitude , longitude,url,pincode etc
            Weather weatherDetails = PinCodeDetail.getWeather(weatherLocation.getLattiTude(),weatherLocation.getLongitude(),searchDTO.getDateStamp()); // getting the weather object

            weatherDetails.setUrl(weatherLocation.getUrl()); // here i am setting the map url;
            weatherDetails.setPin(searchDTO.getPincode());
            weatherLocation.setWeatherPincode(weatherDetails);// here i am doing mapping with location object

           lDao.save(weatherLocation); // now i am storing it on my sql database
           return weatherLocation.getWeatherPincode();

        }
    }
}
