package com.example.shmuel.javaproject;

import java.util.Date;

/**
 * Created by shmuel on 13/03/2016.
 */
public class Account {
    float balance;
    Date lastActionDate;

    public Account() {
        this.balance = 0;
        this.lastActionDate = null;
        this.lastActionSum = 0;
    }

    public float getBalance() {

        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public Date getLastActionDate() {
        return lastActionDate;
    }

    public void setLastActionDate(Date lastActionDate) {
        this.lastActionDate = lastActionDate;
    }

    public float getLastActionSum() {
        return lastActionSum;
    }

    public void setLastActionSum(float lastActionSum) {
        this.lastActionSum = lastActionSum;
    }

    float lastActionSum;
}
