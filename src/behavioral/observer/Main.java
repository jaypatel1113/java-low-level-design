package behavioral.observer;

import behavioral.observer.problem.YouTubeChannelP;
import behavioral.observer.solution.impl.EmailSubscriber;
import behavioral.observer.solution.impl.MobileAppSubscriber;
import behavioral.observer.solution.impl.YouTubeChannel;

public class Main {
    public static void main(String[] args) {
        YouTubeChannelP channel = new YouTubeChannelP();
        channel.uploadNewVideo("Design Patterns in Java");






        YouTubeChannel coders = new YouTubeChannel("coders");

        // Add subscribers
        coders.subscribe(new MobileAppSubscriber("jay"));
        coders.subscribe(new EmailSubscriber("jaypatel@example.com"));

        // Upload video and notify all observers
        coders.uploadVideo("observer-pattern");
    }
}
