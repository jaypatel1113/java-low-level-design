package behavioral.command.solution.commands;

import behavioral.command.solution.contract.Command;
import behavioral.command.solution.receivers.Light;

public class LightOnCommand implements Command {
    private final Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        light.on();
    }

    public void undo() {
        light.off();
    }
}
