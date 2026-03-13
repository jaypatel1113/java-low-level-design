package behavioral.template.problem;

public class EmailNotificationP {

    public void send(String to, String message) {
        System.out.println("rate limit checking: " + to);

        System.out.println("validating email: " + to);

        String formatted = message.trim();
        System.out.println("formatted message: " + formatted + " & sending to: " + to);

        // Compose Email
        String composedMessage = "<html><body><p>" + formatted + "</p></body></html>";
        System.out.println("sending email to: " + to + " with content: \n" + composedMessage);

        // Analytics
        System.out.println("sending analytics for : " + to);
    }
}

