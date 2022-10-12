package homework.Lesson7;

public class Employee {
    public int id;
    public String name;
    public String surname;
    public int age;
    private double salary;
    public String department;

    public void showId() {
        System.out.println(id);
    }

    public void showSurname() {
        System.out.println(surname);
    }

    public void showSalary() {
        System.out.println(salary);
    }

    public Employee(int id2, String name2, String surname2, int age2, double salary2, String department2) {
        id=id2;
        name=name2;
        surname=surname2;
        age=age2;
        salary=salary2;
        department=department2;
    }

    Employee(int id3, String name3, String surname3, int age3, double salary3) {
        id=id3;
        name=name3;
        surname=surname3;
        age=age3;
        salary=salary3;
    }

    private Employee(int id4, String name4, String surname4, double salary4) {
        id=id4;
        name=name4;
        surname=surname4;
        salary=salary4;
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee(1, "mike", "teslin", 30, 0);
        System.out.println("ID: " + emp.id + " name: " + emp.name + " surname: " + emp.surname + " age: " + emp.age + " salary: ");
    }
}


