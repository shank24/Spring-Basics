package com.udemy.spring.springbasics;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {
    @Value("${street:Gaur City}")
    private String street;

    public String getStreet() {
        return street;
    }
}
