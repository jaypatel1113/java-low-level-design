package behavioral.strategy.solution.impl;

import behavioral.strategy.solution.contract.MatchingStrategy;

public class AirportQueueStrategy implements MatchingStrategy {
    @Override
    public void match(String riderLocation) {
        System.out.println("Matching using FIFO airport queue for " + riderLocation);
    }
}