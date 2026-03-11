package structural.bridge.solution.player;

import structural.bridge.solution.contract.VideoQuality;

public class WebPlayer extends VideoPlayer {
    public WebPlayer(VideoQuality quality) {
        super(quality);
    }

    public void play(String title) {
        System.out.println("Web Platform:");
        quality.load(title);
    }
}
