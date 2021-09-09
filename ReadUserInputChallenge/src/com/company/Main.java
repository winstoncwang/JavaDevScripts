package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int counter = 0;
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        while (counter < 10) {
            //validate input to be an int
            System.out.println("Enter number #" + (counter + 1) + ":");
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int number = scanner.nextInt();
                sum += number;
                counter++;
            } else {
                System.out.println("Invalid Number");
            }
            scanner.nextLine(); //handles the enter key if invalid number/nextInt();

        }
        scanner.close();
        System.out.println("The sum of all number is: " + sum);
    }
}
