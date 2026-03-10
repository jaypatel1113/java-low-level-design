package creational.factory.solution;

import creational.factory.solution.contract.Payment;
import creational.factory.solution.factory.PaymentFactory;
import creational.factory.solution.model.PaymentType;

public class PaymentService {
    public void pay (PaymentType type, int amount) {
        Payment creditCardPayment = PaymentFactory.getPaymentInstance(type);
        if (creditCardPayment != null) {
            creditCardPayment.pay(amount);
        } else {
            System.out.println("Payment type not found");
        }
    }
}
