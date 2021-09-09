package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(calcFeetAndInchesToCentimeters(2,5));
        System.out.println(calcFeetAndInchesToCentimeters(29));

    }

    public static double calcFeetAndInchesToCentimeters(int feet, int inches){
        if(feet<0&&(inches<0||inches>12)){
            return -1;
        }
        return (double)((feet*12+inches)*2.54d);
    }

    public static double calcFeetAndInchesToCentimeters(int inches){
        if(inches<0){
            return -1;
        }

        int calFeet = (int)(inches/12);
        int calInches = inches%12;
        return calcFeetAndInchesToCentimeters(calFeet,calInches);
    }
}
