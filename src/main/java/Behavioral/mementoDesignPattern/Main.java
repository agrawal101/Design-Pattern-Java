package Behavioral.mementoDesignPattern;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        ResumeEditor editor = new ResumeEditor();
        ResumeHistory history = new ResumeHistory();

        editor.setName("Alice");
        editor.setEducation("MBA");
        editor.setExperience("Fresher");
        editor.setSkill(Arrays.asList("Economics","marketting"));
        history.save(editor);

        editor.setExperience("one year");
        editor.setEducation("B.Tech");
        history.save(editor);

        editor.printResume();
        System.out.println(" ");

        history.undo(editor);
        editor.printResume();
        System.out.println();

        history.undo(editor);
        editor.printResume();
    }
}