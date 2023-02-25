package com.FrightBox.Controller;

import com.FrightBox.Model.SearchDTO;
import com.FrightBox.Model.WeatherDetails;
import com.FrightBox.Repository.WeatherDetailsRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/weathers")
public class WeatherController {


    @Autowired
    private WeatherDetailsRepository wdao;

    public ResponseEntity<WeatherDetails> getWeatherHandler(@Valid @RequestBody SearchDTO searchDTO){
        Optional<WeatherDetails> optionalWeatherDetails = wdao.findById(searchDTO.getPincode());
        if(optionalWeatherDetails.isPresent()){
           WeatherDetails weather =  optionalWeatherDetails.get();
           return new ResponseEntity<WeatherDetails>(weather, HttpStatus.ACCEPTED);
        }else{

        }
        return null;
    }

}
