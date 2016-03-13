package com.example.shmuel.javaproject;

/**
 * Created by shmuel on 13/03/2016.
 */
public class BookSupplier {
    Supplier supplier;
    Book book;

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public BookSupplier(Supplier supplier, Book book) {

        this.supplier = supplier;
        this.book = book;
    }
}
