package StateDesignPattern;

public class PausedState implements PlayerState{
    @Override
    public void play(Player player)
    {
        System.out.println("Playing .....");
        player.setState(new PlayingState());
    }
    @Override
    public void pause(Player player)
    {
        System.out.println("ALREADY PAUSED");
    }
    @Override
    public void stop(Player player)
    {
        System.out.println("Stopping .....");
        player.setState(new StoppingState());
    }
}
