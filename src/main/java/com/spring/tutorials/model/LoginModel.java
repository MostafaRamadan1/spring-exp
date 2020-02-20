package com.spring.tutorials.model;

import lombok.Data;

@Data
public class LoginModel {

    private String userEmail;
    private String userPass;
    private String loginErrorMessage;
}
