package Behavioral.stateDesignPattern1;

public class Player {
    private PlayerState playerState;
    public Player()
    {
        this.playerState = new StoppingState();
    }
    public void setState(PlayerState playerState)
    {
        this.playerState = playerState;
    }
    public void play()
    {
        playerState.play(this);
    }
    public void pause()
    {
        playerState.pause(this);
    }
    public void stop()
    {
        playerState.stop(this);
    }
}
