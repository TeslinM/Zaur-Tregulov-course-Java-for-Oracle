package homework.Lesson4;

public class Student {
    int numberStudentBillet;
    String name;
    String secondName;
    int yearStudy;
    double valueMath;
    double valueEconomic;
    double valueForeign;

    double sredneeArifm(double math, double economic, double foreign) {
        double result = (math + economic + foreign) / 3;
        return result;
    }
}

class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();



        System.out.println("Middle value first student: " + student1.sredneeArifm(5.5, 8.6, 6.3));
        System.out.println("Middle value second student: " + student2.sredneeArifm(4.5, 9.7, 1.2));
        System.out.println("Middle value second student: " + student3.sredneeArifm(7.5, 4.8, 7.9));

    }
}
