package com.udemy.spring.springbasics;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Television {

    @Value("${tv.name:sony}")
    private String name;

    public Television() {
        System.out.println("Inside the constructor : " + this.name);
    }

    @PostConstruct
    private void init() {
        System.out.println("Inside the init : "+ this.name);
        System.out.println("TV is turned on....");
    }

    public void playMovie() {
        for (int i = 0; i < 6; i++) {
            System.out.println("Playing Scene " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    @PreDestroy
    public void turnOff(){
        System.out.println("TV is turned off....");
    }
}
