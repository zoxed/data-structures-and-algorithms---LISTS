package com.automobile;

public class Car extends Vehicle{
    private int wheels,doors,gears, currentGear;
    private boolean isManual;

    public Car(String name, String size) {
        super(name, size);
    }

    public Car(String name, String size, int wheels, int doors, int gears, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gears = gears;
        this.currentGear = 1;
        this.isManual = isManual;
    }

    public void changeGear(int currentGear) {
        this.currentGear = currentGear;
        System.out.println("car.setCurrentGear(): hcnaged to " + this.currentGear + "gear");
    }
    public void changeVelocity ( int speed,int direction ) {
        move(speed, direction);
        System.out.println("Car.changeVelocityr() : Velocity " + speed + " directions " + direction);
    }

}
