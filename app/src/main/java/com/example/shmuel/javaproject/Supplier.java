package com.example.shmuel.javaproject;

import java.util.Date;
import java.util.List;

/**
 * Created by shmuel on 13/03/2016.
 */
public class Supplier {
    Rateing rateing;
    int personID;
    String name;
    Date birthday;
    Gender gender;
    String address;
    Account account;


    public Supplier(Rateing rateing, int personID, String name, Date birthday, Gender gender, String address, Account account) {
        this.rateing = rateing;
        this.personID = personID;
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.address = address;
        this.account = account;

    }

    public int getPersonID() {

        return personID;
    }

    public void setPersonID(int personID) {
        this.personID = personID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Rateing getRateing() {
        return rateing;
    }

    public void setRateing(Rateing rateing) {
        this.rateing = rateing;
    }
}
