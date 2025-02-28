package com.myapp.bridge_design_pattern;

public class MotorBike extends Vehicle {
    public MotorBike(WorkShop workshop1, WorkShop workShop2) {
        super(workshop1, workShop2);
    }

    @Override
    public void manifacture() {
        System.out.println("Manufacturing Motor bike");
        workshop1.work();
        workShop2.work();
    }
}
