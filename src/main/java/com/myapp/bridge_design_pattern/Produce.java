package com.myapp.bridge_design_pattern;

public class Produce implements WorkShop{

    @Override
    public void work() {
        System.out.println("producing vehicle in workshop");
    }
}
