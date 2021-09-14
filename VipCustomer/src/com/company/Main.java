package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Customer cong = new Customer();
        System.out.println(cong.getName());
        System.out.println(cong.getCreditLimit());
        System.out.println(cong.getEmailAddress());

        Customer newUser = new Customer("Bob",3500);
        System.out.println(newUser.getName());
        System.out.println(newUser.getCreditLimit());
        System.out.println(newUser.getEmailAddress());
    }
}
