package Behavioral.commandDesignPattern2;

public class LightOnCommand implements Command{

    Light light;
    public LightOnCommand(Light light)
    {
        this.light = light;
    }
    @Override
    public void execute()
    {
        light.On();
    }
    @Override
    public void undo()
    {
        light.Off();
    }
}
