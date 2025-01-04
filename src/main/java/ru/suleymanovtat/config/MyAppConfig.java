package ru.suleymanovtat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.suleymanovtat.model.bean.Cat;

@Configuration
public class MyAppConfig {

    @Bean
    public Cat catBean() {
        return new Cat();
    }
}