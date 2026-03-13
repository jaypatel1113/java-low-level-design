package behavioral.state.solution.contract;

import behavioral.state.solution.OrderContext;

public interface OrderState {
    void next(OrderContext context);
    void cancel(OrderContext context);
    String getStateName();
}