package Behavioral.strategyDesignPattern2;

public class Main {

    public static void main(String[] args) {

        RideMatchingService rideMatchingService = new RideMatchingService(new AirportQueueStrategy());
        rideMatchingService.matchRider("Rider 1");
        RideMatchingService rideMatchingService1 = new RideMatchingService(new NearestDriverStrategy());
        rideMatchingService1.matchRider("Rider 2");
        rideMatchingService1.setMatchingStrategy(new SurgePriorityStrategy());
        rideMatchingService1.matchRider("Rider 3");
    }
}