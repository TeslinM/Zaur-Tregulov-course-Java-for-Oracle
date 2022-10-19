package lesson23;

public class Test3 {
    void uvelichenieZP(Employee e) {
        e.salary=e.salary+100;
    }

    public static void main(String[] args) {
        Doctor doc = new Doctor();
        doc.name="Ivan";
        doc.age=50;
        doc.experience=25;
        doc.spec="hirurg";
        doc.eat();
        doc.sleep();
        doc.lechit();
    }
}

class Employee {
    double salary = 100;
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("kushat");
    }

    void sleep() {
        System.out.println("spat");
    }
}

class Doctor extends Employee{
    String spec;

    void lechit() {
        System.out.println("lechit");
    }
}

class Teacher extends Employee{
    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("uchit");
    }
}

class Driver extends Employee{
    String nazvanieMashinu;

    void vodit() {
        System.out.println("vodit");
    }
}