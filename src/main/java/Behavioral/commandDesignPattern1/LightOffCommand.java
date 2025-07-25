package Behavioral.commandDesignPattern1;

public class LightOffCommand implements Command{
    Light light;

    public LightOffCommand(Light light)
    {
        this.light = light;
    }
    public void execute()
    {
        light.turnOff();
    }
}
