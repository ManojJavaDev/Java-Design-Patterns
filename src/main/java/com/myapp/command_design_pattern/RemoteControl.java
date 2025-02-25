package com.myapp.command_design_pattern;

public class RemoteControl {
    private Command command;


    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton(){
        command.execute();
    }


}
