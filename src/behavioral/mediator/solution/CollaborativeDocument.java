package behavioral.mediator.solution;

import behavioral.mediator.solution.contract.DocumentSessionMediator;
import behavioral.mediator.solution.impl.User;

import java.util.ArrayList;
import java.util.List;

public class CollaborativeDocument implements DocumentSessionMediator {
    private final List<User> users = new ArrayList<>();

    @Override
    public void join(User user) {
        users.add(user);
    }

    @Override
    public void broadcastChange(String change, User sender) {
        for (User user : users) {
            if (user != sender) {
                user.receiveChange(change, sender);
            }
        }
    }
}