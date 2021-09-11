package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Account cong = new Account();
        cong.setAccountNumber("125458452");
        System.out.println(cong.getAccountNumber());
        cong.setBalance(254.00);
        System.out.println(cong.getBalance());
        cong.setCustomerName("Cong Wang");
        System.out.println(cong.getCustomerName());
        cong.setEmail("congwang@live.co.uk");
        System.out.println(cong.getEmail());
        cong.setPhoneNumber("02054821579");
        System.out.println(cong.getPhoneNumber());
        System.out.println(cong.withdrawFunds(254.00));
        System.out.println(cong.getBalance());
        System.out.println(cong.withdrawFunds(254.00));
        System.out.println(cong.depositFunds(250.50));
        System.out.println(cong.withdrawFunds(52.50));
        System.out.println(cong.getBalance());
    }
}
