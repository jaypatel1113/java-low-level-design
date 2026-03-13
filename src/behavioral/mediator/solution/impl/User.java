package behavioral.mediator.solution.impl;

import behavioral.mediator.solution.contract.DocumentSessionMediator;

public class User {
    protected String name;
    protected DocumentSessionMediator mediator;

    public User(String name, DocumentSessionMediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }

    public void makeChange(String change) {
        System.out.println(name + " edited the document: " + change);
        mediator.broadcastChange(change, this);
    }

    public void receiveChange(String change, User sender) {
        System.out.println(name + " saw change from " + sender.name + ": \"" + change + "\"");
    }
}
