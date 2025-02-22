package com.myapp.factory_method_design_pattern;

public class MultiAxelFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new MultiAxelVehicle();
    }
}
