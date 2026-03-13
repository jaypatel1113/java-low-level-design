package behavioral.observer.solution.impl;

import behavioral.observer.solution.contract.Subscriber;

public class EmailSubscriber implements Subscriber {
    private final String email;

    public EmailSubscriber(String email) {
        this.email = email;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println("Email sent to " + email + ": New video uploaded - " + videoTitle);
    }
}