package homework.Lesson4;

public class Student {
    int numberStudentBillet;
    String name;
    String secondName;
    int yearStudy;
    double valueMath;
    double valueEconomic;
    double valueForeign;
}

class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();

        student1.valueMath = 6.5;
        student1.valueEconomic = 7.6;
        student1.valueForeign = 8.6;

        student2.valueMath = 9.6;
        student2.valueEconomic = 7.5;
        student2.valueForeign = 3.2;

        student3.valueMath = 4.6;
        student3.valueEconomic = 6.9;
        student3.valueForeign = 9.9;

        System.out.println("Middle value first student: " + ((student1.valueMath + student1.valueEconomic + student1.valueForeign) / 3));
        System.out.println("Middle value second student: " + ((student2.valueMath + student2.valueEconomic + student2.valueForeign) / 3));
        System.out.println("Middle value second student: " + ((student2.valueMath + student2.valueEconomic + student2.valueForeign) / 3));

    }
}
