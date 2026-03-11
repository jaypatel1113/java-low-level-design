package structural.bridge.problem.player.hd;

import structural.bridge.problem.contract.PlayQualityP;

public class MobileHDPlayerP implements PlayQualityP {
    public void play(String title) {
        System.out.println("Mobile Player: Playing " + title + " in HD");
    }
}


