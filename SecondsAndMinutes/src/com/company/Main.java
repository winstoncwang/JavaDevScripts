package com.company;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";

    public static void main(String[] args) {
        // write your code here
        System.out.println(getDurationString(24, 0));
    }

    private static String getDurationString(int minutes, int seconds) {
        if (minutes < 0 || (seconds < 0 || seconds > 59)) {
            return INVALID_VALUE_MESSAGE;
        }
        int hours = (int) minutes / 60;
        int remainMinutes = (int) minutes % 60;

        return ((hours < 10 ? "0" : "") + hours + "h " + (remainMinutes < 10 ? "0" : "") + remainMinutes + "m " + (seconds < 10 ? "0" : "") + seconds + "s");

    }

    private static String getDurationString(int seconds) {
        if (seconds < 0) {
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = (int) seconds / 60;
        int remainSeconds = (int) seconds % 60;
        return getDurationString(minutes, remainSeconds);
    }
}
