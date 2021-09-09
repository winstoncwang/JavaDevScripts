package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
//        System.out.println("10,000 at 2% interest = "+calculateInterest(10000.0,2.0));
//        System.out.println("10,000 at 2% interest = "+calculateInterest(10000.0,3.0));
//        System.out.println("10,000 at 2% interest = "+calculateInterest(10000.0,4.0));
//        System.out.println("10,000 at 2% interest = "+calculateInterest(10000.0,5.0));

        for(int i=0; i<7;i++){ //i=2;i<9 is an alternative
            int x=i+2;
            System.out.println("10,000 at "+x+"% interest = "+String.format("%.2f",calculateInterest(10000.0,(double)x)));
        }

        int primeCount = 0;
        for(int i=10;i<102;i++){
            if(primeCount==3)break;
            if(isPrime(i)){
                System.out.println(i+" is a prime number");
                primeCount++;
            }
        }

    }
    public static boolean isPrime(int n){
        if(n==1)return false;
        for(int i=2;i<=n/2;i++){  //prime number is a number that can only be divided to itself and 1.
            if(n%i==0)return false;    //use n/2 to half the loop we are modulus over. if divisible by i, it's not a prime number.
        }
        return true;
    }

    public static double calculateInterest(double amount , double interestRate){
        return (amount*(interestRate/100));
    }
}
