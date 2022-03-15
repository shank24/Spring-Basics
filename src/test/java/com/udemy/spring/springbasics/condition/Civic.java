package com.udemy.spring.springbasics.condition;

public class Civic implements Car {

    @Override
    public void run() {
        System.out.println("I am civic, Speed is 60 mph");
    }
}
