package com.myapp.command_design_pattern;

public class TurnOnCommand implements Command{

    private final Device device;

    public TurnOnCommand(Device device) {
        this.device = device;
    }

    @Override
    public void execute() {
        device.turnOn();
    }
}
