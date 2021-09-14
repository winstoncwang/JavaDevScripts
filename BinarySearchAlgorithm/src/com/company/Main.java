package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int[] array = {1, 5, 12, 24, 58, 154, 210, 250, 255, 268, 272, 350, 450, 585, 595, 650, 660, 670};
        System.out.println(binarySearch(array, 269));
    }

    public static int binarySearch(int[] array, int number) {
        int count = 0;
        int low = 0;
        int high = array.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int guess = array[mid];
            count++;

            if (guess == number) {
                System.out.println("Guesses made: " + count);
                return mid;
            }
            if (guess < number) {
                low = mid + 1;
            } else if (guess > number) {
                high = mid - 1;
            }
        }
        return -1;
    }
}
