package creational.abstractfactory.solution.factory;

import creational.abstractfactory.solution.contract.Invoice;
import creational.abstractfactory.solution.contract.PaymentGateway;
import creational.abstractfactory.solution.contract.RegionalFactory;
import creational.abstractfactory.solution.gateway.india.PayUGateway;
import creational.abstractfactory.solution.gateway.india.RazorpayGateway;
import creational.abstractfactory.solution.invoice.GSTIndia;
import creational.abstractfactory.solution.models.GatewayType;

public class IndiaFactory implements RegionalFactory {
    @Override
    public PaymentGateway createPaymentGateway(GatewayType gatewayType) {
        switch (gatewayType) {
            case RAZORPAY: return new RazorpayGateway();
            case PAY_U: return new PayUGateway();
            default: return null;
        }
    }

    @Override
    public Invoice createInvoice() {
        return new GSTIndia();
    }
}
