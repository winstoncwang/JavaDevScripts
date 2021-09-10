package com.company;

public class Main {

    public static void main(String[] args) {
        Car porsche = new Car();
        porsche.setModel("m11");
        String modelName = porsche.getModel();
        System.out.println(modelName);
    }
}
