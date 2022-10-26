package lesson26;

public class Test1 {
    public static void main(String[] args) {
        Employee emp1 = new Teacher();
        Employee emp2 = new Driver();
        Employee emp3 = new Doctor();
        Employee emp4 = new Employee();
        Employee[] array = {emp1, emp2, emp3, emp4};
        for(Employee e:array) {
            if(e instanceof Driver) {
                System.out.println(((Driver) e).mashina);
                ((Driver)e).work();
            }
        }
    }
}

class Employee {
    void sleep() {
        System.out.println("Employee sleeps");
    }
    void work() {
        System.out.println("spat");
    }
}

class Teacher extends Employee implements Help_able{
    void work() {
        System.out.println("Teacher works");
    }
    public void help() {
        System.out.println("Teacher helps");
    }
}

class Driver extends Employee {
    String mashina = "mersedes";
    void work() {
        System.out.println("Driver works");
    }
    public void help() {
        System.out.println("Driver helps");
    }
}

class Doctor extends Employee {
    void work() {
        System.out.println("Doctor works");
    }
    public void help() {
        System.out.println("Doctor helps");
    }
}

interface Help_able {
    void help();
}