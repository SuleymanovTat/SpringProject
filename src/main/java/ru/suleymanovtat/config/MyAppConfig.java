package ru.suleymanovtat.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.Scope;
import ru.suleymanovtat.model.annotation.Child;
import ru.suleymanovtat.model.bean.Cat;

@Configuration
@PropertySource("classpath:myApp.properties")
public class MyAppConfig {

    @Bean
    @Scope(value = "singleton")
//    @Scope(value = "prototype")
    public Cat catBean() {
        return new Cat();
    }

    @Bean
    public Child childBean() {
        return new Child();
    }
}