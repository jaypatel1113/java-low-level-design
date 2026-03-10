package creational.abstractfactory.problem.payment.impl;

import creational.abstractfactory.problem.payment.contract.PaymentGateway;

public class PaypalGateway implements PaymentGateway {
    @Override
    public void processPayment(int amount) {
        System.out.println("Paypal Processed: " + amount);
    }
}
