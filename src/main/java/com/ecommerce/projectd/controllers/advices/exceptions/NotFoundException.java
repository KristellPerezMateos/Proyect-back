package com.ecommerce.projectd.controllers.advices.exceptions;

public class NotFoundException extends RuntimeException{
    public NotFoundException(){
        super("Not found");
    }
}
