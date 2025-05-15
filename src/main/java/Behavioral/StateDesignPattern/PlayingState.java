package Behavioral.StateDesignPattern;

public class PlayingState implements PlayerState{
    @Override
    public void play(Player player)
    {
        System.out.println("Already Playing");
    }
    @Override
    public void pause(Player player)
    {
        System.out.println("Pausing ....");
        player.setState(new PausedState());
    }
    @Override
    public void stop(Player player)
    {
        System.out.println("STOPPING ....");
        player.setState(new StoppingState());
    }
}
