package com.company;

public class Car {

    private int doors; //fields/states
    private int wheels;
    private String model;
    private String engine;
    private String colour;

    public void setModel(String model){
        this.model = model;
    }

    public String getModel(){
        return this.model;
    }
}