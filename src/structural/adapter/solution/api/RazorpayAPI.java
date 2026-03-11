package structural.adapter.solution.api;

public class RazorpayAPI {
    // it accepts int
    public void createOrder(int amountInPaise) {
        System.out.println("Razorpay processed payment of paise " + amountInPaise);
    }
}
