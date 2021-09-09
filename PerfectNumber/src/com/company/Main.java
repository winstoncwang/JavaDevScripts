package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(isPerfectNumber(6));
        System.out.println(isPerfectNumber(28));
        System.out.println(isPerfectNumber(5));
        System.out.println(isPerfectNumber(-1));
    }

    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        int divisor = 1;
        if (number > 0) {
            while (divisor <= number) {
                if (number % divisor == 0 && divisor!=number) {
                    sum += divisor;
                }
                divisor++;
            }
            return sum == number;
        }
        return false;
    }
}
