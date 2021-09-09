package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
        System.out.println(canPack(1, 0, 4));
        System.out.println(canPack(1, 0, 5));
        System.out.println(canPack(0, 5, 4));
        System.out.println(canPack(2, 2, 11));
        System.out.println(canPack(-3, 2, 12));
        System.out.println(canPack(2, 10, 18));
    }

    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if (bigCount >= 0 && smallCount >= 0 && goal >= 0) {
            int needBigCount = goal / 5;
            int needSmallCount = goal % 5;
            if (needBigCount > 0 && bigCount > 0) {
                if (bigCount >= needBigCount && smallCount >= needSmallCount) {
                    return true;
                } else if (bigCount < needBigCount) {
                    int remainder = goal - bigCount * 5;
                    if (smallCount >= remainder) {
                        return true;
                    }
                }
            } else if (bigCount == 0) {
                if (smallCount >= goal) {
                    return true;
                }
            }
        }
        return false;
    }
}
