package com.udemy.spring.springbasics;

import com.github.javafaker.Faker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Salary {
    @Autowired
    private Faker faker;

    public int getAmount() {
        return this.faker.number().randomDigit();
    }

}
