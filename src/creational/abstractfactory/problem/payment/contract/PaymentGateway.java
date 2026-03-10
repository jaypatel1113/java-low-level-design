package creational.abstractfactory.problem.payment.contract;

public interface PaymentGateway {
    void processPayment(int amount);
}
