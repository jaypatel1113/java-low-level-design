package creational.factory.problem.impl;

import creational.factory.problem.contract.Payment;

public class DebitCardPayment implements Payment {
    @Override
    public void pay(int amount) {
        System.out.println("Processed payment using credit card : " + amount);
    }
}
