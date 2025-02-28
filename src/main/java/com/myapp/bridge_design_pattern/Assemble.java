package com.myapp.bridge_design_pattern;

public class Assemble implements  WorkShop{
    @Override
    public void work() {
        System.out.println("Assembling Vehicle");
    }
}
