package com.FrightBox.Exceptions;

public class WeatherExceptions extends RuntimeException{
    public WeatherExceptions(){

    }
    public WeatherExceptions(String message){
    super(message);
    }
}
