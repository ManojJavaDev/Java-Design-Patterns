package com.myapp.factory_method_design_pattern;

public class TwoWheelerFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new TwoWheelerVehicle();
    }
}
