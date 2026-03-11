package structural.bridge.solution.player;

import structural.bridge.solution.contract.VideoQuality;

public abstract class VideoPlayer {
    protected VideoQuality quality;

    public VideoPlayer(VideoQuality quality) {
        this.quality = quality;
    }

    public abstract void play(String title);
}
