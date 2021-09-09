package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        printSquareStar(22);
    }

    public static void printSquareStar(int number) {
        if (number < 5) {
            System.out.println("Invalid Value");
            return;
        }
        for (int y = 0; y < number; y++) {
            //row
            System.out.print("\n");
            for (int x = 0; x < number; x++) {
                //column
                //print first row last row
                if (x == 0 || x == number - 1 || y == 0 || y == number - 1) {
                    System.out.print("*");
                } else if (y == x) {
                    System.out.print("*");
                } else if (x == number - y - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
        }
    }

}
