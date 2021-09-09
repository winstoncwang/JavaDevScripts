package com.company;

public class Main {
    public static void main(String[] args) {
        printMegaBytesAndKiloBytes(5000);
    }

    public static void printMegaBytesAndKiloBytes(int kiloBytes){
        if(kiloBytes >=0){
            int megaBytes = kiloBytes / 1024;
            int remainderKiloBytes = kiloBytes % 1024;
            System.out.println(kiloBytes+" KB = "+megaBytes+" MB and "+remainderKiloBytes+" KB");
        }else {
            System.out.println("Invalid Value");
        }
    }
}
