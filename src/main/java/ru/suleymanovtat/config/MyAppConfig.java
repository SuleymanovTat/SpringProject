package ru.suleymanovtat.config;

import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;
import ru.suleymanovtat.aop.Library;
import ru.suleymanovtat.aop.Store;
import ru.suleymanovtat.aop.aspects.LibraryAspect;
import ru.suleymanovtat.aop.aspects.LoggerAspect;
import ru.suleymanovtat.aop.aspects.LoggerStoreAspect;
import ru.suleymanovtat.model.annotation.Child;
import ru.suleymanovtat.model.bean.Book;
import ru.suleymanovtat.model.bean.Cat;

@Configuration
@PropertySource("classpath:myApp.properties")
@EnableAspectJAutoProxy
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

    @Bean
    public Library libraryBean() {
        return new Library();
    }

    @Bean
    public Book bookBean() {
        return new Book();
    }

    @Bean
    @Order(10)
    public LibraryAspect libraryAspectBean() {
        return new LibraryAspect();
    }

    @Bean
    @Order(20)
    public LoggerAspect loggerAspect() {
        return new LoggerAspect();
    }

    @Bean
    public Store storeBean() {
        return new Store();
    }

    @Bean
    public LoggerStoreAspect loggerStoreAspectBean() {
        return new LoggerStoreAspect();
    }
}