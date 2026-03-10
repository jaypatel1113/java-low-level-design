package creational.factory;

import creational.factory.problem.PaymentServiceProblem;
import creational.factory.solution.PaymentService;
import creational.factory.solution.model.PaymentType;

public class Main {
    public static void main(String[] args) {
        PaymentServiceProblem ps = new PaymentServiceProblem();
        ps.pay("CC", 100);
        ps.pay("DC", 100);
        ps.pay("UPI", 100);
        ps.pay("TEST", 100);

        System.out.print("\n================\n");

        PaymentService paymentService = new PaymentService();
        paymentService.pay(PaymentType.CREDIT_CARD, 100);
        paymentService.pay(PaymentType.DEBIT_CARD, 100);
        paymentService.pay(PaymentType.UPI, 100);
        paymentService.pay(PaymentType.PAYPAL, 100);
    }
}
