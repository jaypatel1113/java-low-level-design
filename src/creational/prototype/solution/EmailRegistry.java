package creational.prototype.solution;

import creational.prototype.problem.EmailTemplateProblem;
import creational.prototype.solution.contract.EmailTemplate;
import creational.prototype.solution.templates.FeatureEmail;
import creational.prototype.solution.templates.WelcomeEmail;

import java.util.HashMap;
import java.util.Map;

public class EmailRegistry {
    private static final Map<String, EmailTemplate> emailTemplates = new HashMap<String, EmailTemplate>();

    // pre-store template of each email
    static {
        emailTemplates.put("welcome", new WelcomeEmail());
        emailTemplates.put("feature", new FeatureEmail());

        // add more here
    }

    public static EmailTemplate getEmailTemplate(String name) {
        // return clone of it... coz we don't want to alter default content
        return emailTemplates.get(name).clone();
    }
}
