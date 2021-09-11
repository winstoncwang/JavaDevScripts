package com.company;

public class Account {

    private String accountNumber;
    private double balance;
    private String customerName;
    private String email;
    private String phoneNumber;

    public String depositFunds(double balance) {
        this.balance += balance;
        return "Deposit of amount " + balance + " has been added to your account.";
    }

    public String withdrawFunds(double balance) {
        if (this.balance <= 0 || this.balance < balance) {
            return "Not enough savings.";
        }
        this.balance -= balance;
        return "Amount of "+balance+" has been withdrawn.";
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


}
