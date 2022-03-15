package com.udemy.spring.springbasics.condition;

import org.springframework.stereotype.Component;

@Component
public class Accord implements Car {

    @Override
    public void run() {
        System.out.println("I am accord, Speed is 80 mph");
    }
}
