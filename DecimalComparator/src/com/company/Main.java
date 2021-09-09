package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(areEqualByThreeDecimalPlaces(3.1756, -3.175));
    }

    public static boolean areEqualByThreeDecimalPlaces(double a, double b) {
        //move decimal to thousands th position
        int firstValue = (int) (a * 1000);
        int secondValue = (int) (b * 1000);

        return firstValue == secondValue;
    }
}
