package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(sumFirstAndLastDigit(10));
    }

    public static int sumFirstAndLastDigit(int number) {
        if (number >= 0 && number <= 9) return number + number;
        if (number >= 10) {
            System.out.println("im greater than 10");
            int sum = 0;
            int lastDigit = number % 10;
            sum += lastDigit;
            while (number > 0) {
                if (number < 10) {
                    sum += number;
                    return sum;
                }
                number /= 10;

            }
        }
        return -1;
    }
}
