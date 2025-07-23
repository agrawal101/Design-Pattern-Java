package Behavioral.strategyDesignPattern2;

public class AirportQueueStrategy implements MatchingStrategy{

    @Override
    public void match(String location)
    {
        System.out.println("Airport Queue Strategy for location "+location);
    }
}
