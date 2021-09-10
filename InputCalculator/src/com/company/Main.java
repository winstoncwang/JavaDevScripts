package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        inputThenPrintSumAndAverage();
    }

    public static void inputThenPrintSumAndAverage() {
        int sum = 0, avg = 0, count = 0;
        Scanner scanner = new Scanner(System.in);

        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            if (hasNextInt) {
                int userInput = scanner.nextInt();
                sum += userInput;
                count++;
            }else{
                //(double)sum/count => 11.0/4 is different to (double)(sum/count) => (double)(11/4)
                System.out.println("SUM = "+sum+" AVG = "+(sum==0?avg:Math.round((double)sum/count)));
                break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}
