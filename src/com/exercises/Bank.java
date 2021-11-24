package com.exercises;

public class Bank {


    private int accountNumber;
    private double balance;
    private String customerName,email,phoneNumber;


    public Bank(String customerName, String email, String phoneNumber) {
        this(9999, 100.5, customerName,email,phoneNumber);
    }

    public Bank(){
        this(125,6549,"simo","simo@gmail.com","65445587");
        System.out.println("I'm here .");
    }
    public Bank(int accountNumber, double balance, String customerName, String email, String phoneNumber) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.customerName = customerName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        System.out.println("I'm not here");
    }

    public void deposit(double dmt){
        this.balance +=dmt;
        System.out.println("deposit of " + dmt +" made. New balance is "+ balance);
    }
    public void withdraw(double wt){
        if (balance - wt <= 0){
            System.out.println("only " + balance + " available, withdrawal not proceeded");
        }else {
            balance -= wt;
            System.out.println("withdrawal of "+wt +" proceeded remaining balance = "+ balance);
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() { return balance; }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getPhoneNumber() { return phoneNumber; }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}
