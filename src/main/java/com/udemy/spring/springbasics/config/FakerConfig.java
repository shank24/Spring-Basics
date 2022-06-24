package com.udemy.spring.springbasics.config;

import com.github.javafaker.Faker;
import com.udemy.spring.springbasics.annotation.LazyConfiguration;
import org.springframework.context.annotation.Bean;

@LazyConfiguration
public class FakerConfig {

    @Bean
    public Faker getFaker(){
        return new Faker();
    }
}
