package com.FrightBox.Services;

import com.FrightBox.Exceptions.WeatherExceptions;
import com.FrightBox.Model.WeatherDetails;
import com.FrightBox.Repository.WeatherDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WeatherDetailsServiceImpl implements WeatherDetailsService{
    @Autowired
    private WeatherDetailsRepository wDao;


    @Override
    public WeatherDetails registerWeatherDetails(WeatherDetails weatherDetails) throws WeatherExceptions {
        return wDao.save(weatherDetails);
    }

    @Override
    public Optional<WeatherDetails> getWeatherDetails(Integer pincode) throws WeatherExceptions {
        Optional<WeatherDetails> opt = wDao.findById(pincode);
        return opt;
    }
}
