package structural.adapter.solution.api;

public class PayUAPI {
    // it accepts double
    public void makePayment(double amount) {
        System.out.println("PayU processed payment of INR " + amount);
    }
}
