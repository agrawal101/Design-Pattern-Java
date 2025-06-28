package creational.prototypeDesignPattern;

public class Student implements Prototype{

    int id;
    String name;
    int marks;

    public Student(int id,String name,int marks)
    {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    @Override
    public Prototype clone()
    {
        return new Student(id,name,marks);
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }
}
