package com.day2.classandobject.day2.constructor;

public class Account {

    private  String number;
    private  String customerName;
    private  String customerEmail;
    private  String customerPhone;
    private  double balance;

    public Account() {
        System.out.println("Empty Constructor Called");
    }
    public Account(String number, String customerName, String customerEmail, String customerPhone, double balance) {

        this.number = number;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.balance = balance;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of " + depositAmount + "$ made. New balance : " + this.balance + "$");
    }
    public void withdraw(double withdrawalAmount){
        if (this.balance - withdrawalAmount < 0){
            System.out.println("only " + this.balance + "$ available. Withdrawal not processed");
        }else {
            this.balance -= withdrawalAmount;
            System.out.println("Withdrawal of " + withdrawalAmount + "$ processed. Remaining balance : " + this.balance+ "$");
        }
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
