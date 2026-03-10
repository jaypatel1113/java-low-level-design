package creational.abstractfactory;

import creational.abstractfactory.problem.CheckoutServiceProblem;
import creational.abstractfactory.solution.CheckoutService;
import creational.abstractfactory.solution.models.Country;
import creational.abstractfactory.solution.models.GatewayType;

public class Main {
    public static void main(String[] args) {
        CheckoutServiceProblem checkoutServicep1 = new CheckoutServiceProblem("india", "razorpay");
        CheckoutServiceProblem checkoutServicep2 = new CheckoutServiceProblem("india", "paypal");
        CheckoutServiceProblem checkoutServicep3 = new CheckoutServiceProblem("us", "paypal");
        CheckoutServiceProblem checkoutServicep4 = new CheckoutServiceProblem("russia", "paypal");

        checkoutServicep1.checkout();
        checkoutServicep2.checkout();
        checkoutServicep3.checkout();
        checkoutServicep4.checkout();


        System.out.print("\n================\n\n");


        CheckoutService checkoutService1 = new CheckoutService(Country.INDIA, GatewayType.RAZORPAY);
        CheckoutService checkoutService2 = new CheckoutService(Country.INDIA, GatewayType.PAYPAL);
        CheckoutService checkoutService3 = new CheckoutService(Country.USA, GatewayType.PAYPAL);
        CheckoutService checkoutService4 = new CheckoutService(Country.USA, GatewayType.PAY_U);

        checkoutService1.checkout();
        checkoutService2.checkout();
        checkoutService3.checkout();
        checkoutService4.checkout();
    }
}
