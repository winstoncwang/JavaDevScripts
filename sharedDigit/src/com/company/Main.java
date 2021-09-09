package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(hasSharedDigit(12, 23));
        System.out.println(hasSharedDigit(12, 2));
        System.out.println(hasSharedDigit(19, 91));
        System.out.println(hasSharedDigit(-19, 91));
        System.out.println(hasSharedDigit(119, 91));
    }

    public static boolean hasSharedDigit(int x, int y) {
        if ((x >= 10 && x <= 99) && (y >= 10 && y <= 99)) {
            if (x % 10 == y % 10 || x % 10 == y / 10 || x / 10 == y % 10 || x / 10 == y / 10) {
                return true;
            }
        }
        return false;
    }
}
