package com.udemy.spring.springbasics.dependency_demo;

import org.springframework.stereotype.Component;

@Component
public class Address {
    private String street;

    public String getStreet() {
        return street;
    }

    public Address(){
        this.street = "123 Main Street";
    }


}
