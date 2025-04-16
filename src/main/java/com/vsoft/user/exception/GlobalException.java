package com.vsoft.user.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.sql.SQLDataException;

@RestControllerAdvice
public class GlobalException {

    @ExceptionHandler(SQLDataException.class)
    public ResponseEntity<com. vsoft. user. model. Exception> handleSQLDataException(Exception e){
        com.vsoft.user.model.Exception ex = new com.vsoft.user.model.Exception("Failure", e.getMessage());
        return new ResponseEntity<>(ex, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<com.vsoft.user.model.Exception> handleRuntimeException(Exception e){
        com.vsoft.user.model.Exception ex = new com.vsoft.user.model.Exception("Failure", e.getMessage());
        return new ResponseEntity<>(ex, HttpStatusCode.valueOf(400));
    }
}
