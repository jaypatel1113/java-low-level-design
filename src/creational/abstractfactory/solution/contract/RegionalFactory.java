package creational.abstractfactory.solution.contract;

import creational.abstractfactory.solution.models.GatewayType;

public interface RegionalFactory {
    PaymentGateway createPaymentGateway(GatewayType gatewayType);
    Invoice createInvoice();
}
