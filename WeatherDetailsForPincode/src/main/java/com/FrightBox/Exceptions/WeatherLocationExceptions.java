package com.FrightBox.Exceptions;

public class WeatherLocationExceptions extends RuntimeException{
    public WeatherLocationExceptions(){

    }

    public WeatherLocationExceptions(String message){
        super(message);
    }
}
