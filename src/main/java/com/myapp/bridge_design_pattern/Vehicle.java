package com.myapp.bridge_design_pattern;

public abstract class Vehicle {
    WorkShop workshop1;
    WorkShop workShop2;

    public Vehicle(WorkShop workshop1, WorkShop workShop2) {
        this.workshop1 = workshop1;
        this.workShop2 = workShop2;
    }

    abstract public void manifacture();
}
