package com.company;

public class Customer {

    private String name;
    private double creditLimit;
    private String emailAddress;

    public Customer(){
        this("Cong Wang",2500.00,"congwang@live.co.uk");
    }

    public Customer(String name, double creditLimit){
        this(name,creditLimit,"newUser@gmail.com");
    }

    public Customer(String name, double creditLimit, String emailAddress) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.emailAddress = emailAddress;
    }

    public String getName() {
        return name;
    }

    public double getCreditLimit() {
        return creditLimit;
    }

    public String getEmailAddress() {
        return emailAddress;
    }
}
