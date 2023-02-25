package com.FrightBox;


import com.FrightBox.FetchingApis.PinCodeDetails;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalDate;

@SpringBootApplication
public class WeatherDetailsForPincodeApplication {

    public static void main(String[] args) {

        PinCodeDetails.getWeather(488333, LocalDate.ofEpochDay(2022-12-24));

        SpringApplication.run(WeatherDetailsForPincodeApplication.class, args);
    }

}
