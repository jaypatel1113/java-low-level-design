package behavioral.observer.solution.impl;

import behavioral.observer.solution.contract.Channel;
import behavioral.observer.solution.contract.Subscriber;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Channel {
    private final List<Subscriber> subscribers = new ArrayList<>();
    private final String channelName;

    public YouTubeChannel(String channelName) {
        this.channelName = channelName;
    }

    @Override
    public void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    public void uploadVideo(String videoTitle) {
        System.out.println(channelName + " uploaded: " + videoTitle + "\n");
        notifySubscribers(videoTitle);
    }

    @Override
    public void notifySubscribers(String videoTitle) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(videoTitle);
        }
    }
}
