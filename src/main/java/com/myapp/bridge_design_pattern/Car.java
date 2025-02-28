package com.myapp.bridge_design_pattern;



public class Car extends Vehicle {

    public Car(WorkShop workshop1, WorkShop workShop2) {
        super(workshop1, workShop2);
    }

    @Override
    public void manifacture() {
        System.out.println("Manifacturing Car");
        workshop1.work();
        workShop2.work();
    }
}
