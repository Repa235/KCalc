package com.KCalc.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pl.coderion.service.OpenFoodFactsWrapper;
import pl.coderion.service.impl.OpenFoodFactsWrapperImpl;

@Configuration
public class AppConfig {

    @Bean
    OpenFoodFactsWrapper openFoodFactsWrapper(){
        return new OpenFoodFactsWrapperImpl();
    }
}
