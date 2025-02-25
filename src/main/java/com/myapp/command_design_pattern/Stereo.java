package com.myapp.command_design_pattern;

public class Stereo implements Device{
    @Override
    public void turnOn() {
        System.out.println("Stereo has been turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("stereo has been turned off");
    }

    public void adjustVolume(){
        System.out.println("Volume has been adjusted for stereo");
    }

}
