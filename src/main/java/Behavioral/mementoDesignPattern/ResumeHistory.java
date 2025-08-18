package Behavioral.mementoDesignPattern;

import java.util.Stack;

public class ResumeHistory {

    private Stack<ResumeEditor.Momento> history = new Stack<>();

    public void save(ResumeEditor editor)
    {
        history.push(editor.save());
    }

    public void undo(ResumeEditor editor)
    {
        if(!history.isEmpty())
        {
            editor.restore(history.pop());
        }
    }
}