package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(getEvenDigitSum(0));
    }

    public static int getEvenDigitSum(int number){
        int sum =0;
        if(number>=0){
            while(number>0){
                int digit = number%10;
                if(digit%2==0){
                    sum+=digit;
                }
                number/=10;
            }
            return sum;
        }
        return -1;
    }
}
