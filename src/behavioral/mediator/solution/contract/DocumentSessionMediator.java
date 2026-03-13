package behavioral.mediator.solution.contract;

import behavioral.mediator.solution.impl.User;

public interface DocumentSessionMediator {
    void broadcastChange(String change, User sender);
    void join(User user);
}