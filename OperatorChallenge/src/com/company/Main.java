package com.company;

public class Main {

    public static void main(String[] args) {
        double firstDouble = 20.00d;
        double secondDouble = 80.00d;
        double totalDouble = (firstDouble + secondDouble)*100.00d;
        System.out.println(totalDouble);

        double remainderValue = totalDouble % 40.00d;
        boolean isNoRemainder = (remainderValue == 0)? true:false;
        System.out.println("boolean value = " + isNoRemainder);
        if(!isNoRemainder){
            System.out.println("Got some remainder");
        }
    }
}
