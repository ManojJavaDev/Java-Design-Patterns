package com.myapp.bridge_design_pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Bridge Design Pattern");
        WorkShop workShop1 = new Produce();
        WorkShop workShop2 = new Assemble();

        Vehicle vehicle = new Car(workShop1,workShop2);
        vehicle.manifacture();

    }
}
