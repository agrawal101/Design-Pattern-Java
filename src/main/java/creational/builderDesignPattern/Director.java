package creational.builderDesignPattern;

public class Director {

    StudentBuilder studentBuilder;

    public Director(StudentBuilder studentBuilder)
    {
        this.studentBuilder = studentBuilder;
    }
    public Student createStudent(){
        if(studentBuilder instanceof EngineeringStudentBuilder)
        {
            return createEngineeringStudent();
        }
        else if(studentBuilder instanceof MBAStudentBuilder)
        {
            return createMBAStudent();
        }
        return null;
    }
    private Student createEngineeringStudent()
    {
        return studentBuilder.setRoll(1).setAge(25).setName("Abc").setMotherName("xyz").setSubjects().build();
    }
    private Student createMBAStudent()
    {
        return studentBuilder.setRoll(2).setName("xyz").setMotherName("abc").setAge(50).setSubjects().build();
    }

}
