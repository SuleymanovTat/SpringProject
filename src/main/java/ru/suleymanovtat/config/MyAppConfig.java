package ru.suleymanovtat.config;

import org.springframework.context.annotation.*;
import ru.suleymanovtat.aop.Library;
import ru.suleymanovtat.aop.aspects.LibraryAspect;
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
    public LibraryAspect libraryAspectBean() {
        return new LibraryAspect();
    }
}