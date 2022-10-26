package lesson24;



public class Test2 {
    public Object abc() {
        return new String("a");
    }

    public static void main(String[] args) {
        Doctor d = new Doctor();
        Teacher t = new Teacher();
        Driver dr = new Driver();
        Employee e = new Employee();

        Employee emp1 = new Doctor();
        System.out.println(emp1.salary);
        System.out.println(emp1.name);
        System.out.println(emp1.age);
        System.out.println(emp1.experience);
        emp1.eat();
        emp1.sleep();


        Employee emp2 = new Teacher();
        Employee emp3 = new Driver();
        Xirurg x = new Xirurg();
        Doctor d2 = new Xirurg();
        System.out.println(d2.age);
        System.out.println(d2.salary);
        System.out.println(d2.name);
        System.out.println(d2.experience);
        d2.eat();
        d2.lechit();
        d2.sleep();
        Employee emp4 = new Xirurg();
        emp4.eat();
        emp4.sleep();
        System.out.println(emp4.experience);
        System.out.println(emp4.age);
        System.out.println(emp4.salary);
        System.out.println(emp4.name);



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

    class Xirurg extends Doctor {
    String skalpel;
    void operaciya() {}
    }

    class Teacher extends Employee {
        int kolichestvoUchenikov;

        void uchit() {
            System.out.println("uchit");
        }
    }

    class Driver extends Employee {
        String nazvanieMashinu;

        void vodit() {
            System.out.println("vodit");
        }
    }

