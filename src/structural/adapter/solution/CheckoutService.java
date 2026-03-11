package structural.adapter.solution;

import structural.adapter.solution.contract.PaymentGateway;

public class CheckoutService {
    private final PaymentGateway paymentGateway;

    public CheckoutService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void checkout(double amount) {
        System.out.println("Checkout started for amount: " + amount);
        paymentGateway.pay(amount);
        System.out.println("Checkout completed");
    }
}