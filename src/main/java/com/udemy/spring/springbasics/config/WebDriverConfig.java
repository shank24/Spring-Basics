package com.udemy.spring.springbasics.config;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.*;

/*
This class is used for creating WebDriver Config.
 */
@Lazy
@Configuration
@Profile("!remote")
public class WebDriverConfig {

    @Value("${default.timeout:25}")
    private int timeOut;

    @Bean
    @ConditionalOnProperty(name="browser", havingValue = "firefox")
    public WebDriver firefoxDriver() {
        WebDriverManager.firefoxdriver().setup();
        return new FirefoxDriver();
    }

    @Bean
    //@Primary
    //The below property should be last in sequence.
    @ConditionalOnMissingBean
    //@ConditionalOnProperty(name="browser", havingValue = "chrome")
    public WebDriver chromeDriver() {
        WebDriverManager.chromedriver().setup();
        return new ChromeDriver();
    }

    @Bean
    public WebDriverWait webDriverWait(WebDriver driver)
    {
        return new WebDriverWait(driver,this.timeOut);
    }
}
