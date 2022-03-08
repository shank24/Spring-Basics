package com.udemy.spring.springbasics;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Salary {
    @Value("${amount:200}")
    private int amount;

    public int getAmount() {
        return amount;
    }

}
