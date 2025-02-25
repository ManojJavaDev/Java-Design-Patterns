package com.myapp.command_design_pattern;

public class ChangeChannelCommand implements Command{

    private final Tv tv;

    public ChangeChannelCommand(Tv tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.changeChannel();
    }
}
