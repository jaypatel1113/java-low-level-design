package behavioral.strategy;

import behavioral.strategy.problem.RideMatchingService1;
import behavioral.strategy.solution.RideMatchingService;
import behavioral.strategy.solution.impl.AirportQueueStrategy;
import behavioral.strategy.solution.impl.NearestDriverStrategy;
import behavioral.strategy.solution.impl.SurgePriorityStrategy;

public class Main {
    public static void main(String[] args) {
        RideMatchingService1 service = new RideMatchingService1();

        service.matchRider("Downtown", "NEAREST");
        service.matchRider("City Center", "SURGE_PRIORITY");
        service.matchRider("Airport Terminal 1", "AIRPORT_QUEUE");




        System.out.println("\n\n===================\n\n");


        RideMatchingService rideMatchingService = new RideMatchingService(new NearestDriverStrategy());
        rideMatchingService.matchRider("Downtown");

        rideMatchingService.setStrategy(new SurgePriorityStrategy());
        rideMatchingService.matchRider("City Center");

        rideMatchingService.setStrategy(new AirportQueueStrategy());
        rideMatchingService.matchRider("Airport Terminal 1");
    }
}
