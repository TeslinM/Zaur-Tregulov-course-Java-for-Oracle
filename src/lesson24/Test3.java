package lesson24;


public class Test3 {
    public static void main(String[] args) {
        Employee1 e = new Teacher1();
        e.eat();
    }
}

class Eda {}
class Frukti extends Eda {}

class Employee1 {
    double salary = 100;
    String name;
    int age;
    int experience;

    void eat() {
        System.out.println("kushaet rabotnik");
    }

    void sleep() {
        System.out.println("spat");
    }
}

class Teacher1 extends Employee1 {
    void eat() {
        System.out.println("kushaet teacher");
    }

    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("uchit");
    }
}

class A {
    Employee objectCreation() {
        return new Employee();
    }
}

class B extends A {
    H objectCreation() {
        return new H();
    }
}

class H extends Teacher {

}