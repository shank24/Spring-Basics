package com.udemy.spring.springbasics;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private String street;

    public Address(){
        this.street = "123 High Street";
    }

    public String getStreet(){
        return street;
    }
}
