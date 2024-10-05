package com.example.demo.exception;

import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice //đánh dấu đây là 1 class để bắt lỗi

public class ValidationHandler {
    //Canh bắt lỗi cho mình
    //MethodArgumentNotValidException => lỗi do thư viện quăng ra

    //syntax ~ cách thiết kế API
    @ExceptionHandler(MethodArgumentNotValidException.class) // nếu gặp lỗi này thì hàm sẽ được chạy
    public ResponseEntity handleValidation(MethodArgumentNotValidException exception) {
        String message = "";
        for(FieldError fieldError : exception.getBindingResult().getFieldErrors()) {
            message += fieldError.getDefaultMessage();
        }
        return ResponseEntity.ok(message);
    }

}
