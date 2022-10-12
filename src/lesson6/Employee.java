package lesson6;

import java.sql.SQLOutput;

public class Employee {

    Employee(int id2, String surname2, int age2) {
        this(id2, surname2, age2, 0, null);
    }

    public Employee(String surname3, int age3) {
        this(0, surname3, age3, 0, null);
    }

    Employee(int id4, String surname4, int age4, int salary4, String department4) {
        id=id4;
        surname=surname4;
        age=age4;
        salary=salary4;
        department=department4;
    }

    int id;
    String surname;
    int age;
    int salary;
    String department;
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp1 = new Employee(1, "petrov", 26);
        System.out.println(emp1.id);
        System.out.println(emp1.surname);
        Employee emp2 = new Employee("ivanod", 89);
        Employee emp3 = new Employee(3,"ivan",30, 1000, "IT");
        System.out.println(emp3.department);
    }
}