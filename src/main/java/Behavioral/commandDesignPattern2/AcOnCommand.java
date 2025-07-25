package Behavioral.commandDesignPattern2;

public class AcOnCommand implements Command{

    AC ac;
    public AcOnCommand(AC ac)
    {
        this.ac = ac;
    }
    @Override
    public void execute()
    {
        ac.On();
    }

    @Override
    public void undo()
    {
        ac.Off();
    }
}
