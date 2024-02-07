package com.exceptionHandling.exception.GlobalExceptionHandilar;

import com.exceptionHandling.exception.constant.ApiError;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
@ControllerAdvice
public class RestExceptionHandler {
    @ExceptionHandler(value = productnotfoundException.class)
    public ResponseEntity<ApiError>handleNoProduct()
    {
        ApiError error = new ApiError(400,"noproduct found ",new Date());
        return new ResponseEntity(error,HttpStatus.BAD_REQUEST);
    }


}
