package com.houses;

public class App3 {
    public static void main(String[] args) {

        house newHouse = new house("blue");
        house anotherHouse = new house();
        house whiteHouse = new house("white");

        anotherHouse.setColor("red");
//        System.out.println(newHouse.getColor());
//        System.out.println(anotherHouse.getColor());


        whiteHouse = anotherHouse;

        System.out.println(newHouse.getColor());
        System.out.println(anotherHouse.getColor());
        System.out.println(whiteHouse.getColor());
    }
}
