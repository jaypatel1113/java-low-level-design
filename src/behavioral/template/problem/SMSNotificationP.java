package behavioral.template.problem;

public class SMSNotificationP {

    public void send(String to, String message) {
        System.out.println("rate limit checking: " + to);

        System.out.println("validating email: " + to);

        String formatted = message.trim();
        System.out.println("formatted message: " + formatted + " & sending to: " + to);

        // Compose SMS
        String composedMessage = "[SMS] " + formatted;
        System.out.println("sending sms to " + to + " with message: " + composedMessage);

        // Analytics
        System.out.println("custom sms analytics for : " + to);
    }
}

