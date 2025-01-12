package ru.suleymanovtat.aop;

import ru.suleymanovtat.model.bean.Meal;

import java.util.ArrayList;

public class Store {

    private final ArrayList<Meal> listOfMeals = new ArrayList<>();

    public void addMeal(Meal meal) {
        listOfMeals.add(meal);
    }

    public ArrayList<Meal> getListOfMeals() {
//        int number = new Random().nextInt();
//        if (number % 2 == 0) {
//            throw new NullPointerException("NullPointerException in listOfMeals");
//        }
        return listOfMeals;
    }
}
