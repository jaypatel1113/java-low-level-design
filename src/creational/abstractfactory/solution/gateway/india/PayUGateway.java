package creational.abstractfactory.solution.gateway.india;

import creational.abstractfactory.solution.contract.PaymentGateway;

public class PayUGateway implements PaymentGateway {
    @Override
    public void processPayment(int amount) {
        System.out.println("PayU processed : " + amount);
    }
}
