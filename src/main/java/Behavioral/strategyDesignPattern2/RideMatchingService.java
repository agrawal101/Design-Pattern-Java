package Behavioral.strategyDesignPattern2;

public class RideMatchingService {

    private MatchingStrategy matchingStrategy;

    public RideMatchingService(MatchingStrategy matchingStrategy)
    {
        this.matchingStrategy = matchingStrategy;
    }

    public void setMatchingStrategy(MatchingStrategy matchingStrategy)
    {
        this.matchingStrategy = matchingStrategy;
    }
    public void matchRider(String location)
    {
        matchingStrategy.match(location);
    }
}
