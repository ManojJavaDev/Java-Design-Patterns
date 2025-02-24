package com.myapp.abstract_factory_design_pattern;

public class NorthAmericaCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new SedanCar();
    }

    @Override
    public CarSpecifications createSpecifications() {
        return new NorthAmericaSpecifications();
    }
}
