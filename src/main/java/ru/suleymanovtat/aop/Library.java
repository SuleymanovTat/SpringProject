package ru.suleymanovtat.aop;

import ru.suleymanovtat.model.bean.Book;

public class Library {

    public void getBook() {
        System.out.println("Мы берем книгу: getBook");
    }

    public void getBook(Book book) {
        System.out.println("Мы берем книгу: " + book.getName());
    }

    public String getBookName() {
       return  "Apple";
    }
}
