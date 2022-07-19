package com.udemy.spring.springbasics.kelvin.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.stereotype.Component;

@Component
public class WebDriverFactory {
    public WebDriver getWebDriver(String browser){

        if("chrome".equalsIgnoreCase(browser)){
            WebDriverManager.chromedriver().setup();
            return new ChromeDriver();
        }
        else{
            WebDriverManager.firefoxdriver().setup();
            return new FirefoxDriver();
        }
    }
}
