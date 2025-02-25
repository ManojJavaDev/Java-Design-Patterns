package com.myapp.command_design_pattern;

public class TurnOffCommand implements Command{

    private final Device device;

    public TurnOffCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOff();
    }
}
