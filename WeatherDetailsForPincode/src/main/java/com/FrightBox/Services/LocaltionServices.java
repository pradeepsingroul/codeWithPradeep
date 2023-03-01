package com.FrightBox.Services;

import com.FrightBox.Exceptions.WeatherLocationExceptions;
import com.FrightBox.Model.SearchDTO;
import com.FrightBox.Model.Weather;

public interface LocaltionServices {

     Weather getWeather(SearchDTO searchDTO) throws WeatherLocationExceptions;


}
