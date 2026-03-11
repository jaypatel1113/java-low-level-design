package structural.bridge.problem.player.hd;

import structural.bridge.problem.contract.PlayQualityP;

public class WebHDPlayerP implements PlayQualityP {
    public void play(String title) {
        System.out.println("Web Player: Playing " + title + " in HD");
    }
}
