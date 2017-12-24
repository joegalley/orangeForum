package com.lumeresoftware.orangeforum.controller.error;

import com.lumeresoftware.orangeforum.controller.exception.UnknownCategoryException;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class ControllerErrorHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(value = UnknownCategoryException.class)
    protected ResponseEntity<Object> handleUnknownCategoryException(UnknownCategoryException ex, WebRequest request) {
        String msg = String.format("Category with id %s not found", ex.getCategoryId());

        return handleExceptionInternal(ex, msg, new HttpHeaders(), HttpStatus.NOT_FOUND, request);
    }
}