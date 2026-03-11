package structural.bridge.problem.player.ultrahd;

import structural.bridge.problem.contract.PlayQualityP;

public class WebUltraHDPlayerP implements PlayQualityP {
    public void play(String title) {
        // Web player plays in 4K
        System.out.println("Web Player: Playing " + title + " in 4K");
    }
}
