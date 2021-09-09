package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(getLargestPrime(21));
        System.out.println(getLargestPrime(217));
        System.out.println(getLargestPrime(0));
        System.out.println(getLargestPrime(45));
        System.out.println(getLargestPrime(-1));
        System.out.println(getLargestPrime(7));
        System.out.println(getLargestPrime(1415486));
    }

    public static int getLargestPrime(int number) {
        if (number < 2) {
            return -1;
        }
        //first check isPrime
        int divisor = 2;
        while (divisor < number) {
            if (number % divisor == 0) {
                //not a prime number throw back into the method for a second run
                return getLargestPrime(number/divisor);
            }
            divisor++;
        }
        return number;
    }
}
