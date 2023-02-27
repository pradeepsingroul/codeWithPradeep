package com.FrightBox.Controller;

import com.FrightBox.FetchingApis.PinCodeDetail;
import com.FrightBox.Model.SearchDTO;
import com.FrightBox.Model.Weather;
import com.FrightBox.Model.Location;
import com.FrightBox.Repository.WeatherRepository;
import com.FrightBox.Repository.LocationRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/weathers")
public class WeatherController {

    @Autowired
    private WeatherRepository wDao;

    @Autowired
    private LocationRepository lDao;

    @PostMapping("/data")
    public ResponseEntity<Weather> getWeatherHandler(@Valid @RequestBody SearchDTO searchDTO){

        Optional<Weather> optionalWeatherDetails = wDao.findById(searchDTO.getPincode()); // here i am checking that does weather details already exits with this pincode. if exits then just take the data from database and return
        if(optionalWeatherDetails.isPresent()){
           Weather weather = optionalWeatherDetails.get(); // getting the weather object.
           return new ResponseEntity<Weather>(weather, HttpStatus.ACCEPTED); // just return weather as response entity.
        }else{

            Location weatherLocation = PinCodeDetail.getLocationDetails(searchDTO.getPincode(),searchDTO.getDateStamp());// getting the location object like lattitude , longitude,url,pincode etc
            Weather weatherDetails = PinCodeDetail.getWeather(weatherLocation.getLattiTude(),weatherLocation.getLongitude(),searchDTO.getDateStamp()); // getting the weather object

            weatherDetails.setUrl(weatherLocation.getUrl()); // here i am setting the map url;

            weatherLocation.setWeatherPincode(weatherDetails);// here i am doing mapping with location object

            lDao.save(weatherLocation); // now i am storing it on my sql database

            return new ResponseEntity<Weather>(weatherLocation.getWeatherPincode(),HttpStatus.CREATED);

        }

    }

}
