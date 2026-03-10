package creational.abstractfactory.solution.invoice;

import creational.abstractfactory.solution.contract.Invoice;

public class GSTIndia implements Invoice {
    @Override
    public void generateInvoice() {
        System.out.println("Invoice generated and added GST");
    }
}
