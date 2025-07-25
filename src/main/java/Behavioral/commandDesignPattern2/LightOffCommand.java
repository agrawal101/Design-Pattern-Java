package Behavioral.commandDesignPattern2;

public class LightOffCommand implements Command{
    Light light;
    public LightOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute()
    {
        light.Off();
    }

    @Override
    public void undo()
    {
        light.On();
    }
}
