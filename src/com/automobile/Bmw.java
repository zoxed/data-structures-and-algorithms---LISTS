package com.automobile;

public class Bmw extends Car{
    private int roadServiceMonths;

    public Bmw(int roadServiceMonths) {
        super("M5", "4WD", 4, 4, 6, false);
        this.roadServiceMonths = roadServiceMonths;
    }
    public void accelerate (int rate){
        int newVelocity = getCurrentVelocity() + rate;
        if (newVelocity == 0){
            stop();
            changeGear(1);
        } else if (newVelocity > 0 && newVelocity <= 10 ){
            changeGear(1);
        } else if (newVelocity > 20 && newVelocity <= 20 ){
            changeGear(2);
        } else if (newVelocity > 30 && newVelocity <= 30 ){
            changeGear(3);
        } else {
            changeGear(4);
        }
        if (newVelocity > 0){
            changeVelocity(newVelocity,getCurrentDirection());
        }
    }
}
