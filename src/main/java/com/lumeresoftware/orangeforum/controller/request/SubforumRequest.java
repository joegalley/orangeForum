package com.lumeresoftware.orangeforum.controller.request;

import lombok.Data;

import javax.validation.constraints.NotNull;

@Data
public class SubforumRequest {
    @NotNull
    public String title;
}
