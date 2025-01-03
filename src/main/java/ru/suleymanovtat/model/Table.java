package ru.suleymanovtat.model;

public class Table {
    public String name;

    public Table(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    private void init(){
        System.out.println("init");
    }

    private void destroy(){
        System.out.println("destroy");
    }
}
