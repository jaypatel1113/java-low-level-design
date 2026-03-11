package structural.adapter.solution.adapter;

import structural.adapter.solution.api.PayUAPI;
import structural.adapter.solution.contract.PaymentGateway;

public class PayUAdapter implements PaymentGateway {
    private final PayUAPI payUApi;

    public PayUAdapter(PayUAPI payUApi) {
        this.payUApi = payUApi;
    }

    public void pay(double amount) {
        payUApi.makePayment(amount);
    }
}
