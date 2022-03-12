package com.udemy.spring.springbasics.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;

@Lazy
@Configuration
public class WebDriverConfig {

    @Value("${default.timeout:30}")
    private int timeout;


    //@Primary
    @Bean
    @ConditionalOnProperty(name= "browser", havingValue="chrome")
    public WebDriver chromeDriver(){
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }


    @Bean
    @ConditionalOnProperty(name= "browser", havingValue="firefox")
    public WebDriver firefoxDriver(){
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    @Bean
    public WebDriverWait WebDriverWait(WebDriver driver){
        return new WebDriverWait(driver,this.timeout);
    }
}
