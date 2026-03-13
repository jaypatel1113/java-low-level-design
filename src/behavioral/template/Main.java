package behavioral.template;

import behavioral.template.problem.EmailNotificationP;
import behavioral.template.problem.SMSNotificationP;
import behavioral.template.solution.EmailNotification;
import behavioral.template.solution.NotificationSender;
import behavioral.template.solution.SMSNotification;

public class Main {
    public static void main(String[] args) {
        EmailNotificationP emailNotificationP = new EmailNotificationP();
        SMSNotificationP smsNotificationP = new SMSNotificationP();

        // code duplication for every notification type - if we add new notification then it will again add duplicated code
        emailNotificationP.send("example@example.com", "Your order has been placed!");
        System.out.println(" ");
        smsNotificationP.send("1234567890", "Your OTP is 1234.");



        System.out.println("\n\n============================\n\n");




        NotificationSender emailSender = new EmailNotification();
        emailSender.send("john@example.com", "learning template pattern");

        System.out.println(" ");

        NotificationSender smsSender = new SMSNotification();
        smsSender.send("9876543210", "Your OTP is 4567.");

    }
}
