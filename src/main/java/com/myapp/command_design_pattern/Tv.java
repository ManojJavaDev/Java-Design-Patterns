package com.myapp.command_design_pattern;

public class Tv implements Device{

    @Override
    public void turnOn() {
        System.out.println("TV has been turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("TV has been turned off");
    }

    public void changeChannel(){
        System.out.println("channel has been changed ");
    }
}
