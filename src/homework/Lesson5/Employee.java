package homework.Lesson5;

public class Employee {
    int id;
    String surname;
    int age;
    int salary;
    String department;

    Employee(int id, String surname, int age, int salary, String department) {
        this.id=id;
        this.surname=surname;
        this.age=age;
        this.salary=salary;
        this.department=department;
    }

    int plusSalary() {
        salary *= 2;
        return salary;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee first = new Employee(1, "teslin", 30, 1000, "developer");
        Employee second = new Employee(2, "gotov", 31, 1500, "developer");
        int newSalary1 = first.plusSalary();
        int newSalary2 = second.plusSalary();
        System.out.println(newSalary1);
        System.out.println(newSalary2);
    }
}