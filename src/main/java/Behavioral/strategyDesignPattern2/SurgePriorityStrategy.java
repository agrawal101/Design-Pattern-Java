package Behavioral.strategyDesignPattern2;

public class SurgePriorityStrategy implements MatchingStrategy{

    @Override
    public void match(String location)
    {
        System.out.println("Surge Priority Strategy for location "+location);
    }
}
