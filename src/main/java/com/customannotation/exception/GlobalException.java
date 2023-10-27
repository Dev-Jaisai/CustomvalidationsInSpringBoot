package com.customannotation.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalException {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<CustomError> validation(MethodArgumentNotValidException exception) {

        String newMessage = exception.getMessage();
        CustomError customError = new CustomError(newMessage);
        return new ResponseEntity<>(customError, HttpStatus.BAD_REQUEST);


    }
}
