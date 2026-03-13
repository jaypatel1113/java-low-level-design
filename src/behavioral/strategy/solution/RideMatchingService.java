package behavioral.strategy.solution;

import behavioral.strategy.solution.contract.MatchingStrategy;

public class RideMatchingService {
    private MatchingStrategy strategy;

    public RideMatchingService(MatchingStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(MatchingStrategy strategy) {
        this.strategy = strategy;
    }

    public void matchRider(String riderLocation) {
        strategy.match(riderLocation);
    }
}
