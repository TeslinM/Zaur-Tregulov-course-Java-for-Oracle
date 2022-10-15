package lesson13;

public class Test1 {
}

class Student {
    int grade;

    Student(int grade) {
        this.grade=grade;
    }

    public static void main(String[] args) {
        Student st1 = new Student(1);

        switch(st1.grade) {
            case 2:
                System.out.println("студент двоечник");
                break;
            case 3:
                System.out.println("студент троечник");
                break;
            case 4:
                System.out.println("студент хорошист");
                break;
            case 5:
                System.out.println("студент отличник");
                break;
            default:
                System.out.println("оценка неверная");
        }
    }
}
