package creational.builderDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class MBAStudentBuilder extends StudentBuilder{

    @Override
    public StudentBuilder setSubjects()
    {
        List<String> subs = new ArrayList<>();
        subs.add("Finance");
        subs.add("Accounts");
        subs.add("Marketting");
        subs.add("Business");
        this.subjects = subs;
        return this;
    }
}
