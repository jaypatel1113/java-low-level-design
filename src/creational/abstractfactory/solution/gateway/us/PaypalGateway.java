package creational.abstractfactory.solution.gateway.us;

import creational.abstractfactory.solution.contract.PaymentGateway;

public class PaypalGateway implements PaymentGateway {
    @Override
    public void processPayment(int amount) {
        System.out.println("Paypal Processed: " + amount);
    }
}
