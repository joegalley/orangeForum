package com.lumeresoftware.orangeforum.controller.exception;

import lombok.Data;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@Data
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class UnknownCategoryException extends RuntimeException {

    public String categoryId;

    public UnknownCategoryException(String id) {
        super(id);
        categoryId = id;
    }
}