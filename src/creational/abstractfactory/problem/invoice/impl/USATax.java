package creational.abstractfactory.problem.invoice.impl;

import creational.abstractfactory.problem.invoice.contract.Invoice;

public class USATax implements Invoice {
    @Override
    public void generateInvoice() {
        System.out.println("Invoice generated and added US tax");
    }
}
