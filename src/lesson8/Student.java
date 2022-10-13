package lesson8;

public class Student {
    String name;
    int course;
    static int count;
    int a;


    public Student(String name2, int course2) {
        name = name2;
        course = course2;
        count++;
        System.out.println(" student number " + count + " create");
    }

    public static void showCount() {
        System.out.println("vsego sozdano studentov: " + count);
    }

    public void ShowInfo() {
        System.out.println(" welcome to the student class!!!");
    }

    void abc() {
        a++;
        count++;
    }

    static void abcd() {
        count++;
        Student st2 = new Student("petr", 1);
        st2.a++;
    }

    public static void main(String[] args) {
        Student st1 = new Student("ken", 2);
        abcd();
        st1.abc();
    }
}

