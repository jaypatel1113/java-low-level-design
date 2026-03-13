package behavioral.state.solution.impl;

import behavioral.state.solution.OrderContext;
import behavioral.state.solution.contract.OrderState;

public class DeliveredState implements OrderState {
    public void next(OrderContext context) {
        System.out.println("Order is already delivered.");
    }

    public void cancel(OrderContext context) {
        System.out.println("Cannot cancel a delivered order.");
    }

    public String getStateName() {
        return "DELIVERED";
    }
}
