package com.myapp.abstract_factory_design_pattern;

public class SUVCar implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling SUV car");
    }
}
