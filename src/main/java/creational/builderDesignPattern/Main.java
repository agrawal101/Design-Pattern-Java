package creational.builderDesignPattern;

public class Main {

    public static void main(String[] args) {
       Director d1 = new Director(new MBAStudentBuilder());
       Director d2 = new Director(new EngineeringStudentBuilder());

       Student engineerStudent = d1.createStudent();
       Student mbaStudent = d2.createStudent();

        System.out.println(engineerStudent.toString());
        System.out.println(mbaStudent.toString());

    }
}
