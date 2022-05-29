package com.udemy.spring.springbasics.condition;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.condition.ConditionalOnExpression;
import org.springframework.stereotype.Component;

@Component
//@ConditionalOnExpression("${car.speed} >= 70")
//For specific type, we can use @Qualifier approach
@Qualifier("accord")
public class Accord implements Car {

    @Override
    public void run() {
        System.out.println("I am accord, Speed is 80 mph");
    }
}
