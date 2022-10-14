package homework.Lesson12;

import java.sql.SQLOutput;

public class Student {
    String name;
    int course;
    double grade;

    Student(String name, int course, double grade) {
        this.name = name;
        this.course = course;
        this.grade = grade;
    }
}

class StudentTest {

    void sravnenie(Student s1, Student s2) {
        if (s1.equals(s2)) {
            System.out.println("Студенты равны");
        } else {
            System.out.println("Студенты не равны");
        }
    }

    void polnoeSravnenie(Student s1, Student s2) {
        if (s1.name==s2.name) {
            if (s1.course==s2.course) {
                if (s1.grade==s2.grade) {
                    System.out.println("Имена, курс и оценки у студентов равны!");
                } else {
                    System.out.println("Имена и курс у студентов одинаковые, а оценки отличаются!");}
            } else if (s1.grade==s2.grade) {
                System.out.println("Имена и оценки одинаковые, а курс отличается!");
            } else {
                System.out.println("Имена у студентов одинаковые, а курс и оценки отличаются!");}
        } else {
            System.out.println("Имена, курс и оценки у студентов отличаются!");
        }
    }

    public static void main(String[] args) {
        StudentTest st = new StudentTest();
        Student student1 = new Student("Mike", 1, 8.5);
        Student student2 = new Student("Alesya", 2, 8.5);
        st.sravnenie(student1, student2);
        st.polnoeSravnenie(student1, student2);
    }
}


