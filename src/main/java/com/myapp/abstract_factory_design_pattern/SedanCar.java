package com.myapp.abstract_factory_design_pattern;

public class SedanCar implements Car{
    @Override
    public void assemble() {
        System.out.println("Assembling Sedan car");
    }
}
