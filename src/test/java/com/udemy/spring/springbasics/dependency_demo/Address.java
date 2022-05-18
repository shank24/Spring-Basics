package com.udemy.spring.springbasics.dependency_demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Address {

    @Value("${street:123 High Street}")
    private String street;

    public String getStreet() {
        return street;
    }

}
