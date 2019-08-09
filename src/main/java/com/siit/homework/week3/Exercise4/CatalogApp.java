package com.siit.homework.week3.Exercise4;

public class CatalogApp {

    static LibraryCatalog catalog = new LibraryCatalog();

    public static void main(String[] args) {
        catalog.addBook(new Book("Around the world in 80 days", 256));
        catalog.addBook(new Novel("The great Gatsby", 218, "Fiction"));
        catalog.addBook(new Novel("The book thief", 584, "Historical Fiction"));
        catalog.addBook(new Album("My album", 125, "Good"));
        catalog.addBook(new Book("Adventures of Huckleberry Finn", 366));

        Book oliver = new Book("Oliver Twist", 300);
        catalog.addBook(oliver);

        catalog.listBooks();

        catalog.removeBook(oliver);
        catalog.listBooks();
    }
}
