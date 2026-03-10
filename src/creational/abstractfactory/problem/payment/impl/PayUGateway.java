package creational.abstractfactory.problem.payment.impl;

import creational.abstractfactory.problem.payment.contract.PaymentGateway;

public class PayUGateway implements PaymentGateway {
    @Override
    public void processPayment(int amount) {
        System.out.println("PayU Processed: " + amount);
    }
}
