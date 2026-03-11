package structural.adapter.solution.adapter;

import structural.adapter.solution.api.RazorpayAPI;
import structural.adapter.solution.contract.PaymentGateway;

public class RazorpayAdapter implements PaymentGateway {
    private final RazorpayAPI razorpayApi;

    public RazorpayAdapter(RazorpayAPI razorpayApi) {
        this.razorpayApi = razorpayApi;
    }

    public void pay(double amount) {
        int amountInPaise = (int) (amount * 100);
        razorpayApi.createOrder(amountInPaise);
    }
}
