package structural.bridge.problem.player.ultrahd;

import structural.bridge.problem.contract.PlayQualityP;

public class SmartTVUltraHDPlayerP implements PlayQualityP {
    public void play(String title) {
        System.out.println("Smart TV: Playing " + title + " in ultra HD");
    }
}