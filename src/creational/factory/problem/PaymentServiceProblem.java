package creational.factory.problem;

import creational.factory.problem.contract.Payment;
import creational.factory.problem.impl.CreditCardPayment;
import creational.factory.problem.impl.DebitCardPayment;
import creational.factory.problem.impl.UPIPayment;

public class PaymentServiceProblem {
    Payment payment;

    public void pay(String type, int amount) {
        if (type.equals("CC")) payment = new CreditCardPayment();
        else if (type.equals("DC")) payment = new DebitCardPayment();
        else if (type.equals("UPI")) payment = new UPIPayment();
        else {
            System.out.println("Invalid type of Payment");
            return;
        }

        payment.pay(amount);
    }
}
