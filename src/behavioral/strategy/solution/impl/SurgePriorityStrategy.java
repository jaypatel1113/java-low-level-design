package behavioral.strategy.solution.impl;

import behavioral.strategy.solution.contract.MatchingStrategy;

public class SurgePriorityStrategy implements MatchingStrategy {
    @Override
    public void match(String riderLocation) {
        System.out.println("Matching rider using surge pricing priority near " + riderLocation);
    }
}
