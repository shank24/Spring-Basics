package com.udemy.spring.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

//Autowired is telling that all those classes objects,
// spring has to manage it.
@Component
public class User {
    private Address address;
    private Salary salary;

    @Autowired
    public void setAddress(Address address) {
        this.address = address;
    }

    @Autowired
    public void setSalary(Salary salary) {
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("Address " + this.address.getStreet());
        System.out.println("Address " + this.salary.getAmount());
    }
}
