package behavioral.chainofresponsibility;

import behavioral.chainofresponsibility.problem.SupportServiceP;
import behavioral.chainofresponsibility.solution.SupportHandler;
import behavioral.chainofresponsibility.solution.handlers.BillingSupport;
import behavioral.chainofresponsibility.solution.handlers.DeliverySupport;
import behavioral.chainofresponsibility.solution.handlers.GeneralSupport;
import behavioral.chainofresponsibility.solution.handlers.TechnicalSupport;

public class Main {
    public static void main(String[] args) {
        SupportServiceP supportServiceP = new SupportServiceP();

        // Test with different types of requests
        supportServiceP.handleRequest("general");
        supportServiceP.handleRequest("refund");
        supportServiceP.handleRequest("technical");
        supportServiceP.handleRequest("delivery");
        supportServiceP.handleRequest("unknown");

        // what if there is 100 diff types of agent to handle diff queries.
        // will you create 100 diff else if / switch




        System.out.println("\n\n==========================\n\n");








        SupportHandler general = new GeneralSupport();
        SupportHandler billing = new BillingSupport();
        SupportHandler technical = new TechnicalSupport();
        SupportHandler delivery = new DeliverySupport();

        // Setting up the chain: general -> billing -> technical -> delivery
        general.setNextHandler(billing);
        billing.setNextHandler(technical);
        technical.setNextHandler(delivery);

        // Testing the chain of responsibility with different request types
        general.handleRequest("refund");
        general.handleRequest("delivery");
        general.handleRequest("unknown");
    }
}
