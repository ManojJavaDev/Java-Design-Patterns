package com.myapp.abstract_factory_design_pattern;

public class NorthAmericaSpecifications implements  CarSpecifications{
    @Override
    public void display() {
        System.out.println("building car according to North America rules and regulations");
    }
}
