package structural.adapter.problem.impl;

import structural.adapter.problem.contract.PaymentGateway;

public class PayUGateway implements PaymentGateway {
    @Override
    public void pay(double amt) {
        System.out.println("Pay U Gateway received an amount of " + amt);
    }
}
