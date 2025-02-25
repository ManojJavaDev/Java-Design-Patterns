package com.myapp.command_design_pattern;

public class CommandPatternExample {

    public static void main(String[] args) {
        Tv tv = new Tv();
        Stereo stereo = new Stereo();

        Command turnOnCommand = new TurnOnCommand(tv);
        Command turnOffCommand = new TurnOffCommand(tv);

        Command turnOnStereo = new TurnOnCommand(stereo);
        Command turnOffStereo = new TurnOffCommand(stereo);

        Command adjustVolume = new AdjustVolumeCommand(stereo);
        Command changeChannel = new ChangeChannelCommand(tv);

        RemoteControl rc = new RemoteControl();
        rc.setCommand(turnOnCommand);
        rc.pressButton();

        rc.setCommand(turnOffCommand);
        rc.pressButton();

        rc.setCommand(turnOnStereo);
        rc.pressButton();


        rc.setCommand(turnOffStereo);
        rc.pressButton();


        rc.setCommand(changeChannel);
        rc.pressButton();


        rc.setCommand(adjustVolume);
        rc.pressButton();

    }
}
