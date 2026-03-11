package structural.adapter;

import structural.adapter.problem.CheckoutServiceProblem;
import structural.adapter.problem.impl.PayUGateway;
import structural.adapter.solution.CheckoutService;
import structural.adapter.solution.adapter.PayUAdapter;
import structural.adapter.solution.adapter.RazorpayAdapter;
import structural.adapter.solution.api.PayUAPI;
import structural.adapter.solution.api.RazorpayAPI;
import structural.adapter.solution.contract.PaymentGateway;

public class Main {
    public static void main(String[] args) {
        CheckoutServiceProblem checkoutServiceProblem1 = new CheckoutServiceProblem(new PayUGateway());
        checkoutServiceProblem1.checkOut(100);
        checkoutServiceProblem1.checkOut(100.5);

        // this is error... due to type mismatch. we can't even modify it.. coz its 3rd party api
        // CheckoutServiceProblem checkoutServiceProblem2 = new CheckoutServiceProblem(new RazorpayAPI());

        // PayU flow
        PaymentGateway payUGateway = new PayUAdapter(new PayUAPI());
        CheckoutService payUCheckout = new CheckoutService(payUGateway);
        payUCheckout.checkout(499.99);

        PaymentGateway razorpayGateway = new RazorpayAdapter(new RazorpayAPI());
        CheckoutService razorpayCheckout = new CheckoutService(razorpayGateway);
        razorpayCheckout.checkout(501.2342);
    }
}
