package structural.adapter.problem.api;

public class RazorpayAPI {
    public void makePayment (double amt) {
        System.out.println("Razorpay received an amount of " + amt);
    }
}
