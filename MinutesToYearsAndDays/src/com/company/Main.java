package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        printYearsAndDays(561600);
        printYearsAndDays(-561600);
    }

    public static void printYearsAndDays(long minutes) {
        if (minutes < 0) {
            System.out.println("Invalid Value");
            return;
        }
        int hour = (int) minutes / 60;
        int remainingMinutes = (int) minutes % 60;
        int day = hour / 24;
        int remainingHours = hour % 24;
        int year = day / 365;
        int remainingDays = day % 365;

        System.out.println(minutes + " min = " + year + " y and " + remainingDays + " d");
    }


}
