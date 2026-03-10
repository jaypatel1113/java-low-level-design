package creational.abstractfactory.problem.payment.impl;

import creational.abstractfactory.problem.payment.contract.PaymentGateway;

public class RazorpayGateway implements PaymentGateway {
    @Override
    public void processPayment(int amount) {
        System.out.println("Razorpay Processed: " + amount);
    }
}
