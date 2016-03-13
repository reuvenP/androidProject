package com.example.shmuel.javaproject;

import java.util.Date;
import java.util.List;

/**
 * Created by shmuel on 13/03/2016.
 */
public class Order {
    Supplier supplier;
    Customer customer;
    List<BooksForOrder> booksForOrders;
    Date orderDate;

    public Order(Supplier supplier, Customer customer, List<BooksForOrder> booksForOrders, Date orderDate) {
        this.supplier = supplier;
        this.customer = customer;
        this.booksForOrders = booksForOrders;
        this.orderDate = orderDate;
    }

    public Supplier getSupplier() {

        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public List<BooksForOrder> getBooksForOrders() {
        return booksForOrders;
    }

    public void setBooksForOrders(List<BooksForOrder> booksForOrders) {
        this.booksForOrders = booksForOrders;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public float totalPrice()
    {
        float sum = 0;
        for (BooksForOrder b:booksForOrders) {
            sum += (b.getSum()*b.getBook().getPrice());
        }
        return sum;

    }
}
