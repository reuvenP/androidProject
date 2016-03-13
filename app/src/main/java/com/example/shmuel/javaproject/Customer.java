package com.example.shmuel.javaproject;

import java.util.Date;

/**
 * Created by shmuel on 13/03/2016.
 */
public class Customer extends Person {
    CustomerType customerType;

    public Customer(int personID, String name, Date birthday, Gender gender, String address, Account account, CustomerType customerType) {
        super(personID, name, birthday, gender, address, account);
        this.customerType = customerType;
    }

    public CustomerType getCustomerType() {

        return customerType;
    }

    public void setCustomerType(CustomerType customerType) {
        this.customerType = customerType;
    }
}
