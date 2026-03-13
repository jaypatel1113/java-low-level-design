package behavioral.visitor.problem;

public class PhysicalProductP {
    public void printInvoice() {
        System.out.println("Printing invoice for Physical Product...");
    }

    public double calculateShippingCost() {
        System.out.println("Calculating shipping cost for Physical Product...");
        return 10.0;
    }
}

