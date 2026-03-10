package creational.prototype;

import creational.prototype.problem.EmailTemplateProblem;
import creational.prototype.problem.WelcomeTemplateProblem;
import creational.prototype.solution.EmailRegistry;
import creational.prototype.solution.contract.EmailTemplate;

public class Main {
    public static void main(String[] args) {
        EmailTemplateProblem email1 = new WelcomeTemplateProblem();
        email1.send("user1@example.com");

        // Suppose we want a similar email with slightly different content
        EmailTemplateProblem email2 = new WelcomeTemplateProblem();
        email2.setContent("Hi there! Welcome to TUF Premium.");
        email2.send("user2@example.com");

        // Yet another variation
        EmailTemplateProblem email3 = new WelcomeTemplateProblem();
        email3.setContent("Thanks for signing up. Let's get started!");
        email3.send("user3@example.com");


        // here we created multiple email... first step was same
        // new WelcomeTemplateProblem()

        // why cant we reuse that instead of creating new every time

        EmailTemplate welcome1 = EmailRegistry.getEmailTemplate("welcome");
        welcome1.send("user1@example.com");

        EmailTemplate welcome2 = EmailRegistry.getEmailTemplate("welcome");
        welcome2.setContent("Hi there! Welcome to TUF Premium.");
        welcome2.send("user2@example.com");

        EmailTemplate welcome3 = EmailRegistry.getEmailTemplate("welcome");
        welcome3.setContent("Thanks for signing up. Let's get started!");
        welcome3.send("user3@example.com");


        EmailTemplate feature1 = EmailRegistry.getEmailTemplate("feature");
        feature1.send("user4@gmail.com");
    }
}
