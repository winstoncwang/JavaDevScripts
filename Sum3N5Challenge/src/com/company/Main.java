package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int sum = 0;
        int count = 0;
        for (int i = 1; i < 1001; i++) {
            if (count >= 5) break;
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println(i + " is a valid number.");
                sum += i;
                count++;
            }
        }
        System.out.println("The sum of all valid numbers are equal to " + sum);


    }

}
