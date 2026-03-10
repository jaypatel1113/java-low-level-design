package creational.abstractfactory.solution;

import creational.abstractfactory.solution.contract.Invoice;
import creational.abstractfactory.solution.contract.PaymentGateway;
import creational.abstractfactory.solution.contract.RegionalFactory;
import creational.abstractfactory.solution.factory.CountriesParentFactory;
import creational.abstractfactory.solution.models.Country;
import creational.abstractfactory.solution.models.GatewayType;

public class CheckoutService {
    private final PaymentGateway gateway;
    private final Invoice invoice;

    // just for log
    private final Country country;
    private final GatewayType gatewayType;

    public CheckoutService(Country country, GatewayType gatewayType) {
        RegionalFactory factory = CountriesParentFactory.getFactory(country);
        this.gateway = factory.createPaymentGateway(gatewayType);
        this.invoice = factory.createInvoice();

        // just for log
        this.country = country;
        this.gatewayType = gatewayType;
    }

    public void checkout() {
        if (gateway != null) {
            gateway.processPayment(100);
            invoice.generateInvoice();
        } else {
            System.out.println(gatewayType + " is not supported in " + country);
        }
    }
}
