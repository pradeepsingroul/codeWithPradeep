package com.FrightBox.Services;

import com.FrightBox.Exceptions.WeatherExceptions;
import com.FrightBox.Model.WeatherDetails;

import javax.imageio.spi.RegisterableService;
import java.util.Optional;

public interface WeatherDetailsService {

    WeatherDetails registerWeatherDetails(WeatherDetails weatherDetails) throws WeatherExceptions;

    Optional<WeatherDetails> getWeatherDetails(Integer pincode) throws WeatherExceptions;


}
