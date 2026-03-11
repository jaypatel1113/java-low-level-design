package structural.bridge.solution.quality;

import structural.bridge.solution.contract.VideoQuality;

public class UltraHDQuality implements VideoQuality {
    public void load(String title) {
        System.out.println("Streaming " + title + " in 4K Ultra HD Quality");
    }
}
