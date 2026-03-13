package behavioral.command;

import behavioral.command.problem.NaiveRemoteControlp;
import behavioral.command.problem.receivers.ACp;
import behavioral.command.problem.receivers.Lightp;
import behavioral.command.solution.RemoteControl;
import behavioral.command.solution.commands.*;
import behavioral.command.solution.contract.Command;
import behavioral.command.solution.receivers.AC;
import behavioral.command.solution.receivers.Light;

public class Main {
    public static void main(String[] args) {
        Lightp lightp = new Lightp();
        ACp ACp = new ACp();
        NaiveRemoteControlp remotep = new NaiveRemoteControlp(lightp, ACp);

        remotep.pressLightOn();
        remotep.pressACOn();
        remotep.pressLightOff();
        remotep.pressUndo();
        remotep.pressUndo();


        System.out.println("\n\n=====================\n\n");


        Light light = new Light();
        AC ac = new AC();

        Command lightOn = new LightOnCommand(light);
        Command lightOff = new LightOffCommand(light);
        Command acOn = new ACOnCommand(ac);
        Command acOff = new ACOffCommand(ac);

        RemoteControl remote = new RemoteControl();
        remote.setCommand(0, lightOn);
        remote.setCommand(1, lightOff);
        remote.setCommand(2, acOn);
        remote.setCommand(3, acOff);

        remote.pressButton(0);
        remote.pressButton(2);
        remote.pressButton(1);
        remote.pressUndo();
        remote.pressUndo();
    }
}
