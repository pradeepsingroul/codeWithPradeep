package com.FrightBox.Services;

import com.FrightBox.Exceptions.WeatherLocationExceptions;
import com.FrightBox.Model.SearchDTO;
import com.FrightBox.Model.Location;
import com.FrightBox.Repository.LocationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class WeatherLocationServiceImpl implements WeatherLocaltionServices{

    @Autowired
    private LocationRepository LDao;

    @Override
    public void registerLocation(SearchDTO searchDTO) throws WeatherLocationExceptions {
        Optional<Location> optionalWeatherLocation = LDao.findById(searchDTO.getPincode());
        if(optionalWeatherLocation.isEmpty()){
//            return LDao.save()
        }
    }
}
