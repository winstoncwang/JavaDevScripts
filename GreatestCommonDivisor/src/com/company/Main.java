package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(getGreatestCommonDivisor(9, 30));
    }

    public static int getGreatestCommonDivisor(int firstDividend, int secondDividend) {
        if (firstDividend >= 10 && secondDividend >= 10) {
            //set divisor to the smaller number
            int smallestDividend = firstDividend < secondDividend ? firstDividend : secondDividend;
            int divisor = 1;
            int maxCommonDivisor = 0;
            while (divisor<=smallestDividend){
                if(firstDividend%divisor==0 && secondDividend%divisor==0){
                    maxCommonDivisor = divisor;
                }
                divisor++;
            }
            return maxCommonDivisor;
        }
        return -1;
    }

}
