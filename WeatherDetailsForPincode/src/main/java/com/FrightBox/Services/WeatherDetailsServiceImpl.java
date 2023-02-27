package com.FrightBox.Services;

import com.FrightBox.Exceptions.WeatherExceptions;
import com.FrightBox.Model.Weather;
import com.FrightBox.Repository.WeatherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WeatherDetailsServiceImpl implements WeatherDetailsService{
    @Autowired
    private WeatherRepository wDao;


    @Override
    public Weather registerWeatherDetails(Weather weatherDetails) throws WeatherExceptions {
        return wDao.save(weatherDetails);
    }

    @Override
    public Optional<Weather> getWeatherDetails(Integer pincode) throws WeatherExceptions {
        Optional<Weather> opt = wDao.findById(pincode);
        return opt;
    }
}
