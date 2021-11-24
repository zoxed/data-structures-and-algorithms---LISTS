package com.kaabi;

public class Main {
    public static void main(String[] args) {
        Car porche = new Car();
        Car Mazda = new Car();
        porche.setModel("carerra");
        Mazda.setModel("astra");
        String model = porche.getModel();
        String model1 = Mazda.getModel();
        System.out.println(model +" "+ model1);

    }
}
