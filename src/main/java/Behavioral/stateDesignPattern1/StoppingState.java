package Behavioral.stateDesignPattern1;

public class StoppingState implements PlayerState{
    @Override
    public void play(Player player)
    {
        System.out.println("Playing .....");
        player.setState(new PlayingState());
    }
    @Override
    public void pause(Player player)
    {
        System.out.println("Can't pause, player is stopped");
    }
    @Override
    public void stop(Player player)
    {
        System.out.println("Already stopped");
    }
}
