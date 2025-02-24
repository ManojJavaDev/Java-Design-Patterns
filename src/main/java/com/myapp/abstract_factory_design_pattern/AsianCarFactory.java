package com.myapp.abstract_factory_design_pattern;

public class AsianCarFactory implements CarFactory{
    @Override
    public Car createCar() {
        return new SUVCar();
    }

    @Override
    public CarSpecifications createSpecifications() {
        return new AsianSpecifications();
    }
}
