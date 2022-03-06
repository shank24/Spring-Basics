package com.udemy.spring.springbasics;

import org.springframework.stereotype.Component;

//Autowired is telling that all those classes objects,
// spring has to manage it.
@Component
public class User {
    private Address address;
    private Salary salary;

    public User(Address address, Salary salary) {
        this.address = address;
        this.salary = salary;
    }

    public void printDetails() {
        System.out.println("Address " + this.address.getStreet());
        System.out.println("Address " + this.salary.getAmount());
    }
}
