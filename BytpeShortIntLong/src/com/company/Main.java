package com.company;

public class Main {

    public static void main(String[] args) {

        int maxIntegerValue = Integer.MAX_VALUE;
        int minIntegerValue = Integer.MIN_VALUE;

        System.out.println("Integer Minimum Value = " + minIntegerValue);
        System.out.println("Integer Minimum Value = " + maxIntegerValue);

        byte maxByteValue = Byte.MAX_VALUE;
        byte minByteValue = Byte.MIN_VALUE;

        System.out.println("Byte Maximum Value = " + maxByteValue);
        System.out.println("Byte Minimum Value = " + minByteValue);
        
        short maxShortValue = Short.MAX_VALUE;
        short minShortValue = Short.MIN_VALUE;

        System.out.println("Short Maximum Value = " + maxShortValue);
        System.out.println("Short Minimum Value = " + minShortValue);


        //code challenge
        byte myByteValue = 121;
        short myShortValue = 23212;
        int myIntValue = 232948293;
        long myLongValue = 50000 + 10L * (myByteValue + myIntValue + myShortValue);
        System.out.println(myLongValue);
    }
}
