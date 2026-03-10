package creational.prototype.solution.templates;

import creational.prototype.solution.contract.EmailTemplate;

public class FeatureEmail implements EmailTemplate {
    String subject, content;

    public FeatureEmail() {
        for (long i=0; i<1000000000; i++){}

        // what if this more than 20,000 chars
        this.content = "Hi there! New Feature relased.";
        this.subject = "Feature added: TUF+";
    }

    @Override
    public EmailTemplate clone() {
        try {
            return (EmailTemplate) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException("Clone failed", e);
        }
    }

    @Override
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public void send(String to) {
        System.out.println("Sending Feature update to " + to + ": [" + subject + "] " + content);
    }
}
