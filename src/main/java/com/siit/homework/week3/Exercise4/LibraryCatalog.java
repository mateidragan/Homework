package com.siit.homework.week3.Exercise4;

import java.util.ArrayList;
import java.util.List;

public class LibraryCatalog {

    List<Book> books = new ArrayList<>();

    public void addBook(Book book){
        books.add(book);
    }

    public void removeBook(Book book){
        books.remove(book);
    }

    public void listBooks(){
        for (Book book : books) {
            System.out.println(book);
        }
    }
}
