package com.ecommerce.projectd.controllers.dtos.request;

import lombok.Getter;

@Getter
public class CreateUserRequest {
    private String name;
    private String email;
    private String password;
}
