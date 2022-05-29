package com.udemy.spring.springbasics.config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Lazy
@Configuration
public class WebDriverWaitConfig {

    @Value("${default.timeout:25}")
    private int timeOut;

    @Bean
    public WebDriverWait webDriverWait(WebDriver driver)
    {
        return new WebDriverWait(driver,this.timeOut);
    }
}
