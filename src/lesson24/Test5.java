package lesson24;

public class Test5 {
    public static void main(String[] args) {
        Employee2 emp4 = new Teacher2();
        Teacher2 t2 = new Teacher2();
        t2.sleep();

    }

}

class Employee2 {
    double salary = 100;
    String name;

    void eat() {
        System.out.println("kushat");
    }

    private void sleep() {
        System.out.println("spit rabotnik");
    }
}

class Doctor2 extends Employee2 {
    String spec;

    void lechit() {
        System.out.println("lechit");
    }
}

class Xirurg2 extends Doctor2 {
    String skalpel;
    void operaciya() {}
}

class Teacher2 extends Employee2 {
    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("uchit");
    }
    public void sleep() {
        System.out.println("spit teacher");
    }
}

class Driver2 extends Employee2 {
    String nazvanieMashinu;

    void vodit() {
        System.out.println("vodit");
    }
}

