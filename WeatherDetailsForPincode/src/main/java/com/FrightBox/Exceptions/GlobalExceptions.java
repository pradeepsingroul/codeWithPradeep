package com.FrightBox.Exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.NoHandlerFoundException;

import java.time.LocalDateTime;

@ControllerAdvice
public class GlobalExceptions {

    @ExceptionHandler(Exception.class)
    public ResponseEntity<ErrorDetails> ExceptionsHandler(Exception exception, WebRequest webRequest){
        ErrorDetails errorDetails = new ErrorDetails();

        errorDetails.setMessage(exception.getMessage());
        errorDetails.setDescription(webRequest.getDescription(true));
        errorDetails.setTimeStamp(LocalDateTime.now());

        return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.BAD_GATEWAY);

    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ErrorDetails> MethodArgumentNotValidExceptionHandler(MethodArgumentNotValidException exception, WebRequest webRequest){
        ErrorDetails errorDetails = new ErrorDetails();

        errorDetails.setMessage(exception.getMessage());
        errorDetails.setDescription(webRequest.getDescription(true));
        errorDetails.setTimeStamp(LocalDateTime.now());

        return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.BAD_GATEWAY);

    }

    @ExceptionHandler(NoHandlerFoundException.class)
    public ResponseEntity<ErrorDetails> NoHandlerFoundExceptionHandler(NoHandlerFoundException exception, WebRequest webRequest){
        ErrorDetails errorDetails = new ErrorDetails();

        errorDetails.setMessage(exception.getMessage());
        errorDetails.setDescription(webRequest.getDescription(true));
        errorDetails.setTimeStamp(LocalDateTime.now());

        return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.BAD_GATEWAY);

    }
    @ExceptionHandler(SearchingDTOExceptions.class)
    public ResponseEntity<ErrorDetails> SearchingDTOExceptionsHandler(SearchingDTOExceptions exception, WebRequest webRequest){
        ErrorDetails errorDetails = new ErrorDetails();

        errorDetails.setMessage(exception.getMessage());
        errorDetails.setDescription(webRequest.getDescription(true));
        errorDetails.setTimeStamp(LocalDateTime.now());

        return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.BAD_GATEWAY);

    }
    @ExceptionHandler(WeatherLocationExceptions.class)
    public ResponseEntity<ErrorDetails> WeatherLocationExceptionsHandler(WeatherLocationExceptions exception, WebRequest webRequest){
        ErrorDetails errorDetails = new ErrorDetails();

        errorDetails.setMessage(exception.getMessage());
        errorDetails.setDescription(webRequest.getDescription(true));
        errorDetails.setTimeStamp(LocalDateTime.now());

        return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.BAD_GATEWAY);

    }
    @ExceptionHandler(WeatherExceptions.class)
    public ResponseEntity<ErrorDetails> WeatherExceptionsHandler(WeatherExceptions exception, WebRequest webRequest){
        ErrorDetails errorDetails = new ErrorDetails();

        errorDetails.setMessage(exception.getMessage());
        errorDetails.setDescription(webRequest.getDescription(true));
        errorDetails.setTimeStamp(LocalDateTime.now());

        return new ResponseEntity<ErrorDetails>(errorDetails, HttpStatus.BAD_GATEWAY);

    }



}
