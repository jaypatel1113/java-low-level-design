package behavioral.state;

import behavioral.state.problem.Order;
import behavioral.state.solution.OrderContext;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order();
        System.out.println("Initial State: " + order1.getState());

        order1.nextState(); // ORDER_PLACED -> PREPARING
        order1.nextState(); // PREPARING -> OUT_FOR_DELIVERY
        order1.nextState(); // OUT_FOR_DELIVERY -> DELIVERED

        order1.cancelOrder(); // Should not allow cancellation

        System.out.println("Final State: " + order1.getState());





        System.out.println("\n\n===========================\n\n");









        OrderContext order = new OrderContext();

        // Display initial state
        System.out.println("Current State: " + order.getCurrentState());

        // Moving through states
        order.next();  // ORDER_PLACED -> PREPARING
        order.next();  // PREPARING -> OUT_FOR_DELIVERY
        order.cancel(); // Should fail, as order is out for delivery
        order.next();  // OUT_FOR_DELIVERY -> DELIVERED
        order.cancel(); // Should fail, as order is delivered

        // Display final state
        System.out.println("Final State: " + order.getCurrentState());
    }
}
