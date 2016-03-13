package com.example.shmuel.javaproject;

import java.util.Date;

/**
 * Created by shmuel on 13/03/2016.
 */
public class Supplier extends Person {
    Rateing rateing;

    public Rateing getRateing() {
        return rateing;
    }

    public void setRateing(Rateing rateing) {
        this.rateing = rateing;
    }

    public Supplier(int personID, String name, Date birthday, Gender gender, String address, Account account, Rateing rateing) {

        super(personID, name, birthday, gender, address, account);
        this.rateing = rateing;
    }
}
