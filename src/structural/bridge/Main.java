package structural.bridge;

import structural.bridge.problem.contract.PlayQualityP;
import structural.bridge.problem.player.hd.MobileHDPlayerP;
import structural.bridge.problem.player.hd.WebHDPlayerP;
import structural.bridge.solution.player.MobilePlayer;
import structural.bridge.solution.player.VideoPlayer;
import structural.bridge.solution.player.WebPlayer;
import structural.bridge.solution.quality.HDQuality;
import structural.bridge.solution.quality.UltraHDQuality;

public class Main {
    public static void main(String[] args) {
        PlayQualityP player = new WebHDPlayerP();
        player.play("Interstellar");

        PlayQualityP mobilePlayer = new MobileHDPlayerP();
        mobilePlayer.play("Interstellar");

        // player (web, mobile, tv) and quality (hd, ultrahd) are tightly coupled
        // so separate it out make it independent

        System.out.print("\n\n\n");


        // Playing on Web with HD Quality
        VideoPlayer player1 = new WebPlayer(new HDQuality());
        player1.play("Interstellar");

        // Playing on Mobile with Ultra HD Quality
        VideoPlayer player2 = new MobilePlayer(new UltraHDQuality());
        player2.play("Inception");
    }
}
