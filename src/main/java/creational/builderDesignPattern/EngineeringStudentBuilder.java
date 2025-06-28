package creational.builderDesignPattern;
import java.util.ArrayList;
import java.util.List;
public class EngineeringStudentBuilder extends StudentBuilder{
    @Override
    public StudentBuilder setSubjects()
    {
        List<String> subs = new ArrayList<>();
        subs.add("DSA");
        subs.add("OS");
        subs.add("LLD");
        subs.add("HLD");
        this.subjects = subs;
        return this;
    }
}