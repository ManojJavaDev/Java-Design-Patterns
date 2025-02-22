package com.myapp.factory_method_design_pattern;

public class FourWheelerFactory implements VehicleFactory{
    @Override
    public Vehicle createVehicle() {
        return new FourWheelerVehicle();
    }
}
