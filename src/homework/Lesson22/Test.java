package homework.Lesson22;


import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        Dog dog = new Dog("Vatrushka");
        System.out.println("Количество лап у собаки: " + dog.paw);

        Cat cat = new Cat("Tom");
        cat.sleep();
    }
}
