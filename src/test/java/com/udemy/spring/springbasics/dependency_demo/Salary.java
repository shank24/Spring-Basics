package com.udemy.spring.springbasics.dependency_demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Salary {

    @Value("${amount:1001}")
    private int amount;

    public int getAmount() {
        return amount;
    }
}



