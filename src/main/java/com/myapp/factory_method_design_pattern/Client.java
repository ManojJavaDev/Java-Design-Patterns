package com.myapp.factory_method_design_pattern;

public class Client {

    private final Vehicle pVehicle;

    Client(VehicleFactory factory){
        pVehicle = factory.createVehicle();
    }

    public Vehicle getpVehicle() {
        return pVehicle;
    }

}
