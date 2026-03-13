package behavioral.command.solution.commands;

import behavioral.command.solution.contract.Command;
import behavioral.command.solution.receivers.Light;

public class LightOffCommand implements Command {
    private final Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
