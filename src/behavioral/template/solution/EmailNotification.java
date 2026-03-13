package behavioral.template.solution;

public class EmailNotification extends NotificationSender {
    // Implement message composition for email
    @Override
    protected String composeMessage(String formattedMessage) {
        return "<html><body><p>" + formattedMessage + "</p></body></html>";
    }

    // Implement email sending logic
    @Override
    protected void sendMessage(String to, String message) {
        System.out.println("sending email to " + to + " with content:\n" + message);
    }
}
