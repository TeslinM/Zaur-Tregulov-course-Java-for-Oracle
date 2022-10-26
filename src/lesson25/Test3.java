package lesson25;

public class Test3 {
    public static void main(String[] args) {
        Help_able h = new Driver();
        Swim_able s = new Driver();
        Employee e = new Driver();
        System.out.println(h.a);
        h.help();
        h.tushitPojar();
        s.swim();
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

class Doctor extends Employee {
    String spec;

    void lechit() {
        System.out.println("lechit");
    }
}

class Teacher extends Employee implements Help_able {
    int kolichestvoUchenikov;

    void uchit() {
        System.out.println("uchit");
    }
    public void help() {
        System.out.println("teacher help's");
    }
    public void tushitPojar() {
        System.out.println("teacher tushit pojar");
    }
}

class Driver extends Employee implements Help_able, Swim_able {
    String nazvanieMashinu;

    void vodit() {
        System.out.println("vodit");
    }
    public void help() {
        System.out.println("driver help's");
    }
    public void tushitPojar() {
        System.out.println("driver tushit pojar");
    }
    public void swim() {
        System.out.println("voditel plavaet");
    }
}

interface Help_able {
    void help();
    void tushitPojar();
    int a = 10;
}

interface Swim_able {
    void swim();
}