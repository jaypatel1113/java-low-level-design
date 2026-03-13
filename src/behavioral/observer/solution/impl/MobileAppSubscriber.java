package behavioral.observer.solution.impl;

import behavioral.observer.solution.contract.Subscriber;

public class MobileAppSubscriber implements Subscriber {
    private final String username;

    public MobileAppSubscriber(String username) {
        this.username = username;
    }

    @Override
    public void update(String videoTitle) {
        System.out.println("In-app notification for " + username + ": New video - " + videoTitle);
    }
}