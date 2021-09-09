package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(hasSameLastDigit(41,22,71));
        System.out.println(hasSameLastDigit(23,32,42));
        System.out.println(hasSameLastDigit(9,99,999));
        System.out.println(hasSameLastDigit(22,23,34));
    }

    public static boolean hasSameLastDigit(int x, int y, int z) {
        if (isValid(x) && isValid(y) && isValid(z)) {
            int xLastDigit = x % 10;
            int yLastDigit = y % 10;
            int zLastDigit = z % 10;
            if ((xLastDigit == yLastDigit) || (xLastDigit == zLastDigit) || (yLastDigit == zLastDigit)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isValid(int x) {
        return (x >= 10 && x <= 1000);
    }
}
