package com.udemy.spring.springbasics.kelvin.config;

import com.github.javafaker.Faker;
import com.udemy.spring.springbasics.kelvin.annotation.LazyConfiguration;
import org.springframework.context.annotation.Bean;

@LazyConfiguration
public class FakerConfig {

    @Bean
    public Faker getFaker(){
        return new Faker();
    }
}
