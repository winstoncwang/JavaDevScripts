package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        numberToWords(0);
    }

    public static void numberToWords(int number) {
        if (number >= 0) {
            int count = getDigitCount(number);
            int reverseNumber = reverse(number);
            while (count > 0) {
                int digit = reverseNumber % 10;
                switch (digit) {
                    case 0:
                        System.out.println("Zero");
                        break;
                    case 1:
                        System.out.println("One");
                        break;
                    case 2:
                        System.out.println("Two");
                        break;
                    case 3:
                        System.out.println("Three");
                        break;
                    case 4:
                        System.out.println("Four");
                        break;
                    case 5:
                        System.out.println("Five");
                        break;
                    case 6:
                        System.out.println("Six");
                        break;
                    case 7:
                        System.out.println("Seven");
                        break;
                    case 8:
                        System.out.println("Eight");
                        break;
                    case 9:
                        System.out.println("Nine");
                        break;
                }
                reverseNumber /= 10;
                count--;
            }
            return;
        }
        System.out.println("Invalid Value");
    }

    public static int reverse(int number) {
        int copyNumber = number < 0 ? -number : number;
        int reverseNumber = 0;

        while (copyNumber > 0) {
            int reminder = copyNumber % 10;
            int quote = copyNumber / 10;
            reverseNumber += reminder;
            if (quote > 0) {
                reverseNumber *= 10;
                copyNumber = quote;
            } else {
                break;
            }
        }
        return number < 0 ? -reverseNumber : reverseNumber;
    }

    public static int getDigitCount(int number) {
        int count = 0;
        if (number > 0) {
            while (number > 0) {
                count++;
                number /= 10;
            }
            return count;
        } else if (number == 0) {
            return 1;
        }
        return -1;
    }
}
