package creational.builderDesignPattern;

import java.util.List;

public abstract class StudentBuilder {

    int roll;
    int age;
    String name;
    String motherName;
    List<String> subjects;

    public StudentBuilder setRoll(int roll) {
        this.roll = roll;
        return this;
    }

    public StudentBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setName(String name) {
        this.name = name;
        return this;
    }

    public StudentBuilder setMotherName(String motherName) {
        this.motherName = motherName;
        return this;
    }

    public StudentBuilder setSubjects() {
        return this;
    }
    public Student build() {
        return new Student(this);
    }
}
