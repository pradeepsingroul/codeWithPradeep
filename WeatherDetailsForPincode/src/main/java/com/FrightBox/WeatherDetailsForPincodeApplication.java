package com.FrightBox;


import com.FrightBox.FetchingApis.PinCodeDetail;
import com.FrightBox.Model.Weather;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;
import java.util.Date;

@SpringBootApplication
public class WeatherDetailsForPincodeApplication {

    public static void main(String[] args) {

        SpringApplication.run(WeatherDetailsForPincodeApplication.class, args);
    }

}
