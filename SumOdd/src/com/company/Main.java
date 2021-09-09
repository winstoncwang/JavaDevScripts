package com.company;

public class Main {

    public static void main(String[] args) {
//	    write your code here
//        System.out.println(sumOdd(1,100));
//        System.out.println(sumOdd(-1,100));
//        System.out.println(sumOdd(100,100));
//        System.out.println(sumOdd(13,13));
//        System.out.println(sumOdd(100,-100));
//        System.out.println(sumOdd(100,1000));
        System.out.println(sumDigits(5));
        System.out.println(sumDigits(135));
        System.out.println(sumDigits(235));
    }

    public static int sumDigits(int number) {
        int sum = 0;
        int divisor = 10;
        if (number >= 10) {
            while (number > 0) {
                sum += (number % divisor);
                //System.out.println("total sum " + sum);
                number /= 10;
            }
            return sum;
        }
        return -1;
    }


    public static boolean isOdd(int number) {
        if (number < 0) return false;
        if (number % 2 != 0) return true;
        return false;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if (start < 0 || end < 0 || end < start) return -1;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }
        return sum;
    }
}
