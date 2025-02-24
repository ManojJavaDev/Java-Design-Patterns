package com.myapp.abstract_factory_design_pattern;

public class AsianSpecifications implements CarSpecifications{
    @Override
    public void display() {
        System.out.println("Assembling car according to Asian rules and regulations");
    }
}
