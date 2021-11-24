package com.exercises;

public class VipCustomer {
    String name, emailAdd;
    int creditLimit;

    public VipCustomer() {
//        this(name,emailAdd,creditLimit);
        this("zaki","simon.kaabi@gmail.com",546654);
    }

    public VipCustomer(String name, int creditLimit) {
        this(name,"non@important.com",creditLimit);
    }

    public VipCustomer(String name, String emailAdd, int creditLimit) {
        this.name = name;
        this.emailAdd = emailAdd;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmailAdd() {
        return emailAdd;
    }

    public int getCreditLimit() {
        return creditLimit;
    }
}
