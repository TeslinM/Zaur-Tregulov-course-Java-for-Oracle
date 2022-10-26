package lesson30;

import java.util.ArrayList;

public class Test1 {
}

class Student {
    String name;
    char sex;
    int age;
    int course;
    double avgGrade;

    Student(String name, char sex, int age, int course, double avgGrade) {
        this.name=name;
        this.sex=sex;
        this.age=age;
        this.course=course;
        this.avgGrade=avgGrade;
    }
}

class StudentInfo {
    void printStudent(Student st) {
        System.out.println("Name studenta: " + st.name + "< pol: " + st.sex + "< age: " + st.age + ", course: " + st.course + ", grade: " + st.avgGrade);
    }

    void printStudentOverGrade(ArrayList<Student> al,double avgGrade) {
        for(Student s: al) {
            if(s.avgGrade > avgGrade) {
                printStudent(s);
            }
        }
    }

    void printStudentUnderGrade(ArrayList<Student> al,double avgGrade) {
        for(Student s: al) {
            if(s.avgGrade < avgGrade) {
                printStudent(s);
            }
        }
    }

    void printStudentOverAge(ArrayList<Student> al, int age) {
        for(Student s: al) {
            if(s.age > age) {
                printStudent(s);
            }
        }
    }

    void printStudentUnderAge(ArrayList<Student> al, int age) {
        for(Student s: al) {
            if(s.age < age) {
                printStudent(s);
            }
        }
    }

    void printStudentBySex(ArrayList<Student> al, char sex) {
        for(Student s: al) {
            if(s.sex == sex) {
                printStudent(s);
            }
        }
    }

    void printStudentConditions(ArrayList<Student> al, double avgGrade, int age, char sex) {
        for(Student s: al) {
            if(s.avgGrade > avgGrade && s.age < age && s.sex==sex) {
                printStudent(s);
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        Student st1 = new Student("Ivan", 'm', 22,3,8.3);
        Student st2 = new Student("Petr", 'm', 18,1,6.5);
        Student st3 = new Student("Alla", 'f', 20,2,7.8);
        Student st4 = new Student("Nikolay", 'm', 25,5,8.8);
        Student st5 = new Student("Zina", 'f', 21,4,8.0);
        list.add(st1);
        list.add(st2);
        list.add(st3);
        list.add(st4);
        list.add(st5);
        StudentInfo si = new StudentInfo();
        si.printStudentOverGrade(list, 8);
        System.out.println("___________________________________");
        si.printStudentUnderGrade(list, 8);


    }
}
