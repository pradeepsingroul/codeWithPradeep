package com.FrightBox.Services;

import com.FrightBox.Exceptions.WeatherLocationExceptions;
import com.FrightBox.Model.SearchDTO;

public interface WeatherLocaltionServices {

     void registerLocation(SearchDTO searchDTO) throws WeatherLocationExceptions;


}
