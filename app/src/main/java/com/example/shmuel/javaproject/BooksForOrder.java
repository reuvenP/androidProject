package com.example.shmuel.javaproject;

/**
 * Created by shmuel on 13/03/2016.
 */
public class BooksForOrder {
    Book book;
    int sum;

    public BooksForOrder(Book book, int sum) {
        this.book = book;
        this.sum = sum;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }
}
