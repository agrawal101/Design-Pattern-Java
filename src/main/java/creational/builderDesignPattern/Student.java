package creational.builderDesignPattern;

import java.util.List;

public class Student {

    int roll;
    int age;
    String name;
    String motherName;
    List<String> subjects;

    public Student (StudentBuilder sb)
    {
        this.roll = sb.roll;
        this.name = sb.name;
        this.age = sb.age;
        this.motherName = sb.motherName;
        this.subjects = sb.subjects;
    }

    @Override
    public String toString() {
        return "Student{" +
                "roll=" + roll +
                ", age=" + age +
                ", name='" + name + '\'' +
                ", motherName='" + motherName + '\'' +
                ", subjects=" + subjects +
                '}';
    }
}
