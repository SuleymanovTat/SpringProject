package ru.suleymanovtat;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.suleymanovtat.aop.Store;
import ru.suleymanovtat.config.MyAppConfig;
import ru.suleymanovtat.model.bean.Meal;

public class Main {

    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfig = new AnnotationConfigApplicationContext(MyAppConfig.class);
        Store store = annotationConfig.getBean("storeBean", Store.class);
        store.addMeal(new Meal("apple"));
        //LoggerStoreAspect добавляет milk
        System.out.println(store.getListOfMeals());
        annotationConfig.close();
    }
}
