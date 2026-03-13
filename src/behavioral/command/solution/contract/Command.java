package behavioral.command.solution.contract;

public interface Command {
    void execute();
    void undo();
}
