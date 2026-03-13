package behavioral.mediator.problem;

import java.util.ArrayList;
import java.util.List;

public class User1 {
    private final String name;
    private final List<User1> others;

    public User1(String name) {
        this.name = name;
        this.others = new ArrayList<>();
    }

    public void addCollaborator(User1 user) {
        others.add(user);
    }

    public void makeChange(String change) {
        System.out.println(name + " made a change: " + change);
        for (User1 u : others) {
            u.receiveChange(change, this);  // Notify each collaborator about the change.
        }
    }

    // Method to receive a change notification from another user.
    public void receiveChange(String change, User1 from) {
        System.out.println(name + " received: \"" + change + "\" from " + from.name);
    }
}