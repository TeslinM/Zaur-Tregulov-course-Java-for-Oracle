package lesson30;

public class Test2 {

}

class Student1 {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;
}

interface StudentChecks {
    boolean testStudent(Student s);
}

class FindStudentOverGrade implements StudentChecks {
    public boolean testStudent(Student s) {
        return s.avgGrade>8.5;
    }
}