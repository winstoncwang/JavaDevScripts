package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        printFactors(6);
        printFactors(32);
        printFactors(10);
        printFactors(-1);
        printFactors(1);
    }

    public static void printFactors(int number) {
        if (number > 1) {
            int divisor = 1;
            String firstString = "";
            String secondString = "";

            while (divisor <= number / 2) {
                if (number % divisor == 0) {
                    firstString = firstString + divisor + " ";
                    if (number / divisor > number / 2) {
                        secondString = number / divisor + " " + secondString;
                    }
                }
                divisor++;
            }
            System.out.println(firstString + secondString);
        }else if(number>0&&number<2){
            System.out.println(1);
        }else {
            System.out.println("Invalid Value");
        }
    }

}
