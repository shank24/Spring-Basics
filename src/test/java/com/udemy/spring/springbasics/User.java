package com.udemy.spring.springbasics;

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
