package structural.adapter.problem;

import structural.adapter.problem.contract.PaymentGateway;

public class CheckoutServiceProblem {
    private PaymentGateway paymentGateway;

    public CheckoutServiceProblem (PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void checkOut (double amt) {
        paymentGateway.pay(amt);
    }
}
