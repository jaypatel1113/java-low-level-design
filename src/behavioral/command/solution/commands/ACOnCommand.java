package behavioral.command.solution.commands;

import behavioral.command.solution.contract.Command;
import behavioral.command.solution.receivers.AC;

public class ACOnCommand implements Command {
    private final AC ac;

    public ACOnCommand(AC ac) {
        this.ac = ac;
    }

    public void execute() {
        ac.on();
    }

    public void undo() {
        ac.off();
    }
}
