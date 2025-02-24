package com.myapp.builder_design_pattern;

public class ComputerDirector {

    public void construct(Builder builder) {
        builder.buildCPU();
        builder.buildRAM();
        builder.buildStorage();
    }
}
