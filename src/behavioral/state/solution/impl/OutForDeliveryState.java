package behavioral.state.solution.impl;

import behavioral.state.solution.OrderContext;
import behavioral.state.solution.contract.OrderState;

public class OutForDeliveryState implements OrderState {
    public void next(OrderContext context) {
        context.setState(new DeliveredState());
        System.out.println("Order has been delivered.");
    }

    public void cancel(OrderContext context) {
        System.out.println("Cannot cancel. Order is out for delivery.");
    }

    public String getStateName() {
        return "OUT_FOR_DELIVERY";
    }
}
