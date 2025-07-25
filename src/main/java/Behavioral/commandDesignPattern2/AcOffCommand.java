package Behavioral.commandDesignPattern2;

public class AcOffCommand implements Command{

    AC ac;
    public AcOffCommand(AC ac)
    {
        this.ac = ac;
    }
    @Override
    public void execute()
    {
        ac.Off();
    }

    @Override
    public void undo()
    {
        ac.On();
    }
}
