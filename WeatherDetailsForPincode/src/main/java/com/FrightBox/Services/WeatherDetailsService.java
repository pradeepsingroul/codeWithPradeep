package com.FrightBox.Services;

import com.FrightBox.Exceptions.WeatherExceptions;
import com.FrightBox.Model.Weather;

import java.util.Optional;

public interface WeatherDetailsService {

    Weather registerWeatherDetails(Weather weatherDetails) throws WeatherExceptions;

    Optional<Weather> getWeatherDetails(Integer pincode) throws WeatherExceptions;


}
