package homework.Lesson6;

public class Student {
        int id;
        String name;
        String surName;
        int course;
        double valueMath;
        double valueEconomic;
        double valueForeign;

        Student(int id2, String name2, String surname2, int course2, double valueMath2, double valueEconomic2, double valueForeign2) {
                System.out.println("Create new student with all parameter");
        }

        Student(int id3, String name3, String surname3, int course3) {
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
        }
}
