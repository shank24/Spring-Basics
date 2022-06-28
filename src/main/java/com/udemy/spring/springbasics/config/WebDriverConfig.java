package com.udemy.spring.springbasics.config;

import com.udemy.spring.springbasics.annotation.LazyConfiguration;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;

/*
This class is used for creating WebDriver Config.
 */
@LazyConfiguration
@Profile("!remote")
public class WebDriverConfig {

    @Bean
    @ConditionalOnProperty(name="browser", havingValue = "firefox")
    public WebDriver firefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    @Bean
    @Scope("prototype")
    //@Primary
    //The below property should be last in sequence.
    @ConditionalOnMissingBean
    //@ConditionalOnProperty(name="browser", havingValue = "chrome")
    public WebDriver chromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

}
