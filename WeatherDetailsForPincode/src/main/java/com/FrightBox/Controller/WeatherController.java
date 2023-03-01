package com.FrightBox.Controller;

import com.FrightBox.Model.SearchDTO;
import com.FrightBox.Model.Weather;

import com.FrightBox.Services.LocaltionServices;
import com.FrightBox.Services.WeatherDetailsService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/weathers")
public class WeatherController {
    @Autowired
    private LocaltionServices lServices;

    @Autowired
    private WeatherDetailsService wServices;

    // here i used postMapping user can pass SearchDTO (pincode, date) and it returns weaher weathers
    // we can user getMapping as well if required on that we can directely pass date and pincode for getting the data
    @PostMapping("/data")
    public ResponseEntity<Weather> getWeatherHandler(@Valid @RequestBody SearchDTO searchDTO){
        Weather weather = lServices.getWeather(searchDTO);
        return  new ResponseEntity<Weather>(weather,HttpStatus.ACCEPTED);

    }


}
