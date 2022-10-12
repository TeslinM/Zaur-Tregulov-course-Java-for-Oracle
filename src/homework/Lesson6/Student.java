package homework.Lesson6;

public class Student {
        int id;
        String name;
        String surname;
        int course;
        double valueMath;
        double valueEconomic;
        double valueForeign;

        Student(int id2, String name2, String surname2, int course2, double valueMath2, double valueEconomic2, double valueForeign2) {
                id=id2;
                name=name2;
                surname=surname2;
                course=course2;
                valueMath=valueMath2;
                valueEconomic=valueEconomic2;
                valueForeign=valueForeign2;
                System.out.println("Create new student with all parameter");
        }

        Student(int id3, String name3, String surname3, int course3) {
                this(id3, name3, surname3, course3, 0, 0, 0);
                System.out.println("Create student with 4 parameter");
        }

        Student() {
                System.out.println("Create student without parameter");
        }
}

class StudentTest {
        public static void main(String[] args) {
                Student st1 = new Student();
                Student st2 = new Student(2, "Mike", "Teslin", 3);
                Student st3 = new Student(3, "Petr", "Ivanov", 4, 8.5, 6.4, 7.6);

                System.out.println(st2.name);
        }
}
