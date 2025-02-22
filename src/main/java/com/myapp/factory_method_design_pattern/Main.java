package com.myapp.factory_method_design_pattern;

public class Main {

    public static void main(String[] args){
        VehicleFactory twoWheelerFactory = new TwoWheelerFactory();
        Client twoWheelerClient = new Client(twoWheelerFactory);
        twoWheelerClient.getpVehicle().printVehicle();
        System.out.println();
        VehicleFactory multiAxelFactory = new MultiAxelFactory();
        Client multiAxelClient = new Client(multiAxelFactory);
        multiAxelClient.getpVehicle().printVehicle();

    }


}
