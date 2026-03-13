package behavioral.chainofresponsibility.problem;

public class SupportServiceP {
    public void handleRequest(String type) {
        //if (type.equals("general")) {
        //    System.out.println("Handled by General Support");
        //} else if (type.equals("refund")) {
        //    System.out.println("Handled by Billing Team");
        //} else if (type.equals("technical")) {
        //    System.out.println("Handled by Technical Support");
        //} else if (type.equals("delivery")) {
        //    System.out.println("Handled by Delivery Team");
        //} else {
        //    System.out.println("No handler available");
        //}

        switch (type) {
            case "general" -> System.out.println("Handled by General Support");
            case "refund" -> System.out.println("Handled by Billing Team");
            case "technical" -> System.out.println("Handled by Technical Support");
            case "delivery" -> System.out.println("Handled by Delivery Team");
            default -> System.out.println("No handler available");
        }
    }
}
