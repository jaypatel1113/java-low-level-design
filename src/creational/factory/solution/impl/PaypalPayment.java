package creational.factory.solution.impl;

import creational.factory.solution.contract.Payment;

public class PaypalPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Processed payment using paypal : " + amount);
    }
}
