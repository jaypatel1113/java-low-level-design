package creational.factory.solution.factory;

import creational.factory.solution.contract.Payment;
import creational.factory.solution.impl.CreditCardPayment;
import creational.factory.solution.impl.DebitCardPayment;
import creational.factory.solution.impl.PaypalPayment;
import creational.factory.solution.impl.UPIPayment;
import creational.factory.solution.model.PaymentType;

public class PaymentFactory {
    public static Payment getPaymentInstance(PaymentType type){
        if (type == PaymentType.CREDIT_CARD) return new CreditCardPayment();
        else if (type == PaymentType.DEBIT_CARD) return new DebitCardPayment();
        else if (type == PaymentType.UPI) return new UPIPayment();
        else if (type == PaymentType.PAYPAL) return new PaypalPayment();
        else return null;
    }
}
