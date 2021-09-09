package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        printEqual(1, 1, 1);
        printEqual(1, 1, 2);
        printEqual(-1, -1, -1);
        printEqual(1, 2, 3);
        printEqual(2, 1, 1);
    }

    public static void printEqual(int a, int b, int c) {
        if (a < 0 || b < 0 || c < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if (a == b && a == c && b == c) {
            System.out.println("All numbers are equal");
            return;
        } else if ((a == b && a != c) || (a != b && a == c) || (b != a && b == c) || (b == a && b != c)) {
            System.out.println("Neither all are equal or different");
            return;
        }
        System.out.println("All numbers are different");
    }
}
