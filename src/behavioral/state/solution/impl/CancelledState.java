package behavioral.state.solution.impl;

import behavioral.state.solution.OrderContext;
import behavioral.state.solution.contract.OrderState;

public class CancelledState implements OrderState {
    public void next(OrderContext context) {
        System.out.println("Cancelled order cannot move to next state.");
    }

    public void cancel(OrderContext context) {
        System.out.println("Order is already cancelled.");
    }

    public String getStateName() {
        return "CANCELLED";
    }
}