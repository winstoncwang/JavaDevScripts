package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //use while loop until input is not int
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Scanner scanner = new Scanner(System.in);
        boolean hasNextInt = true;

        while (hasNextInt) {
            System.out.println("Enter number");
            hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int userInput = scanner.nextInt();
                if (userInput < min) {
                    min = userInput;
                }
                if (userInput > max) {
                    max = userInput;
                }
            } else {
                System.out.println("Invalid Number");
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Minimum number: " + min);
        System.out.println("Maximum number: " + max);

    }

}
