package com.udemy.spring.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Autowired is telling that all those classes objects,
// spring has to manage it.
@Component
public class User {
    @Autowired
    private Address address;

    @Autowired
    private Salary salary;

    public void printDetails() {
        System.out.println("Address " + this.address.getStreet());
        System.out.println("Salary " + this.salary.getAmount());
    }
}
