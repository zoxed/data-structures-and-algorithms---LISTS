package com.kaabi;

import com.exercises.Bank;

public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String colour;
    private String engine;

    public Car (){
        System.out.println("I'm here.");
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public void setModel(String model) {
        String validModel=model.toLowerCase();
        if (validModel.equals("carerra") || validModel.equals("astra")) {
            this.model = model;
            System.out.println("success");
        }else {
            this.model="Unknown";
        }
    }

    public String getModel() {
        return this.model;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "doors=" + doors +
                ", wheels=" + wheels +
                ", model='" + model + '\'' +
                ", colour='" + colour + '\'' +
                ", engine='" + engine + '\'' +
                '}';
    }


}
