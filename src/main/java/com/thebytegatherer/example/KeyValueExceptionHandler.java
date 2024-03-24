package com.thebytegatherer.example;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.Instant;
import java.util.List;

@ControllerAdvice
public class KeyValueExceptionHandler {

    @ExceptionHandler(MethodArgumentNotValidException.class)
    @ResponseBody
    public ResponseEntity<ErrorResponse> processUnmergeException(final MethodArgumentNotValidException ex) {

        ErrorResponse err = new ErrorResponse();
        err.erros.add(new Error("code", "title", "detail", Instant.now()));

        return new ResponseEntity<>(err, HttpStatus.BAD_REQUEST);
    }
}
