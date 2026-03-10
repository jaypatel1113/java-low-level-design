package creational.abstractfactory.solution.gateway.india;

import creational.abstractfactory.solution.contract.PaymentGateway;

public class RazorpayGateway implements PaymentGateway {
    @Override
    public void processPayment(int amount) {
        System.out.println("Razorpay processed : " + amount);
    }
}
