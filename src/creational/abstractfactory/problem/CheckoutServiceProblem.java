package creational.abstractfactory.problem;

import creational.abstractfactory.problem.invoice.contract.Invoice;
import creational.abstractfactory.problem.invoice.impl.GSTIndia;
import creational.abstractfactory.problem.invoice.impl.USATax;
import creational.abstractfactory.problem.payment.contract.PaymentGateway;
import creational.abstractfactory.problem.payment.impl.PayUGateway;
import creational.abstractfactory.problem.payment.impl.PaypalGateway;
import creational.abstractfactory.problem.payment.impl.RazorpayGateway;

public class CheckoutServiceProblem {
    private String gateway, country;

    public CheckoutServiceProblem(String country, String gateway) {
        this.country = country;
        this.gateway = gateway;
    }

    public void checkout() {
        PaymentGateway paymentGateway = null;

        if (country.equals("india")) {
            if (gateway.equals("razorpay")) {
                paymentGateway = new RazorpayGateway();
            } else if (gateway.equals("payu")) {
                paymentGateway = new PayUGateway();
            } else {
                System.out.println(gateway + " not supported in India");
                return;
            }

            // process payment then generate invoice (India)
            paymentGateway.processPayment(100);
            Invoice inv = new GSTIndia();
            inv.generateInvoice();

        } else if (country.equals("us")) {
            if (gateway.equals("paypal")) {
                paymentGateway = new PaypalGateway();
            } else {
                System.out.println(gateway + " not supported in US");
                return;
            }

            // process payment then generate invoice (India)
            paymentGateway.processPayment(100);
            Invoice inv = new USATax();
            inv.generateInvoice();
        } else {
            System.out.println("checkout service is not supported in " + country);
        }
    }
}
