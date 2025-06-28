package creational.prototypeDesignPattern;

import org.w3c.dom.ls.LSOutput;

public class Main {

    public static void main(String[] args) {
        Student s1 = new Student(1,"Abc",90);
        Student clone = (Student)s1.clone();

        System.out.println(s1.toString());
        System.out.println(clone.toString());
    }


}
