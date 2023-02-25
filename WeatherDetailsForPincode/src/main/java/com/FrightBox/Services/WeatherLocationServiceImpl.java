package com.FrightBox.Services;

import com.FrightBox.Exceptions.WeatherLocationExceptions;
import com.FrightBox.Model.SearchDTO;
import com.FrightBox.Model.WeatherLocation;
import com.FrightBox.Repository.WeatherLocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class WeatherLocationServiceImpl implements WeatherLocaltionServices{

    @Autowired
    private WeatherLocationRepository LDao;

    @Override
    public void registerLocation(SearchDTO searchDTO) throws WeatherLocationExceptions {
        Optional<WeatherLocation> optionalWeatherLocation = LDao.findById(searchDTO.getPincode());
        if(optionalWeatherLocation.isEmpty()){
//            return LDao.save()
        }
    }
}
