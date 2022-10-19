package lesson23;

public class Human {

    public String name="kolya";
    public static int salary=150;

    public void work() {
        System.out.println("work");
    }

    public void rest() {
        System.out.println("otduhat");
    }
}

class Student extends Human {
    public static void main(String[] args) {
        Student st1 = new Student();
        System.out.println(st1.name);
        System.out.println(Student.salary);
        st1.work();
        st1.rest();

        Human h = new Human();


    }
}
