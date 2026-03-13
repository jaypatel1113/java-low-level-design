package behavioral.command.problem;

import behavioral.command.problem.receivers.ACp;
import behavioral.command.problem.receivers.Lightp;

public class NaiveRemoteControlp {
    private final Lightp lightp;
    private final ACp ACp;
    private String lastAction = "";

    public NaiveRemoteControlp(Lightp lightp, ACp ACp) {
        this.lightp = lightp;
        this.ACp = ACp;
    }

    public void pressLightOn() {
        lightp.on();
        lastAction = "LIGHT_ON";
    }

    public void pressLightOff() {
        lightp.off();
        lastAction = "LIGHT_OFF";
    }

    public void pressACOn() {
        ACp.on();
        lastAction = "AC_ON";
    }

    public void pressACOff() {
        ACp.off();
        lastAction = "AC_OFF";
    }

    public void pressUndo() {
        switch (lastAction) {
            case "LIGHT_ON": lightp.off(); lastAction = "LIGHT_OFF"; break;
            case "LIGHT_OFF": lightp.on(); lastAction = "LIGHT_ON"; break;
            case "AC_ON": ACp.off(); lastAction = "AC_OFF"; break;
            case "AC_OFF": ACp.on(); lastAction = "AC_ON"; break;
            default: System.out.println("No action to undo."); break;
        }
    }
}
