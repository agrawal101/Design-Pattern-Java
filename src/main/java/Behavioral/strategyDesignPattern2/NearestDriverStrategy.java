package Behavioral.strategyDesignPattern2;

public class NearestDriverStrategy implements MatchingStrategy{

    @Override
    public void match(String location)
    {
        System.out.println("Nearest Driver Strategy for location "+location);
    }
}
