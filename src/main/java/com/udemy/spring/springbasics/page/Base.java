package com.udemy.spring.springbasics.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Autowired;

import javax.annotation.PostConstruct;

public abstract class Base {

    //Objects instantiation
    @Autowired
    protected WebDriver driver;

    //Objects instantiation
    @Autowired
    protected WebDriverWait webDriverWait;

    @PostConstruct
    private void init()
    {
        PageFactory.initElements(this.driver,this);

    }

    public abstract boolean isAt();
}
