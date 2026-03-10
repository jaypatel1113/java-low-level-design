package creational.abstractfactory.solution.factory;

import creational.abstractfactory.solution.contract.Invoice;
import creational.abstractfactory.solution.contract.PaymentGateway;
import creational.abstractfactory.solution.contract.RegionalFactory;
import creational.abstractfactory.solution.gateway.us.PaypalGateway;
import creational.abstractfactory.solution.invoice.USATax;
import creational.abstractfactory.solution.models.GatewayType;

public class USFactory implements RegionalFactory {
    @Override
    public PaymentGateway createPaymentGateway(GatewayType gatewayType) {
        switch (gatewayType) {
            case PAYPAL: return new PaypalGateway();
            default: return null;
        }
    }

    @Override
    public Invoice createInvoice() {
        return new USATax();
    }
}
