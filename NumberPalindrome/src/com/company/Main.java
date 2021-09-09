package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(isPalindrome(0));
    }

    public static boolean isPalindrome(int number){
        int reverseNumber = 0;
        if(number<0){
            number=-number;
        }
        int originalNumber = number;
        while(number>0){
            int digit = number%10;
            reverseNumber*=10;
            reverseNumber+=digit;
            number/=10;

        }
        System.out.println("original: "+originalNumber);
        System.out.println("reverse: "+reverseNumber);
        if(reverseNumber == originalNumber){
            return true;
        }

        return false;
    }
}
