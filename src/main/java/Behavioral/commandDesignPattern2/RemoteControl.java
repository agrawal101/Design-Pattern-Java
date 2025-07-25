package Behavioral.commandDesignPattern2;

import java.util.Stack;

public class RemoteControl {

    private Command[] button = new Command[4];
    private Stack<Command> commandHistory = new Stack<>();

    public void setCommand(int ind,Command command)
    {
        button[ind] = command;
    }

    public void pressButton(int slot)
    {
        if(button[slot]!=null)
        {
            button[slot].execute();
            commandHistory.push(button[slot]);
        }
        else
            System.out.println("No command found" +slot);
    }

    public void pressUndo()
    {
        if(!commandHistory.isEmpty())
        {
            commandHistory.pop().undo();
        }
        else
            System.out.println("No command to undo");
    }
}
