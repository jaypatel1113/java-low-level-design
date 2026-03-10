package creational.prototype.problem;

public class WelcomeTemplateProblem implements EmailTemplateProblem {
    private String content;
    private final String subject;

    // assume creation of object is costly and time-consuming
    public WelcomeTemplateProblem() {
        this.subject = "Welcome to TUF+";

        for (long i=0; i<1000000000; i++){}

        // what if this more than 20,000 chars
        this.content = "Hi there! Thanks for joining us.";
    }

    @Override
    public void setContent(String content) {
        // what if this more than 20,000 chars
        this.content = content;
    }

    @Override
    public void send(String to) {
        System.out.println("Sending to " + to + ": [" + subject + "] " + content);
    }
}
