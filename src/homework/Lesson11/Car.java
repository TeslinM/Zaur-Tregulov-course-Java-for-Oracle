package homework.Lesson11;

public class Car {
    public String color;
    public String engine;
    public int door;

    public Car(String color, String engine, int door) {
        this.color=color;
        this.engine=engine;
        this.door=door;
    }

    public void changeDoor(int value) {
        door = value;
    }

    public static void swapColor(Car c1, Car c2) {
        Car c3 = new Car("white", "v6", 0);
        c3.color = c1.color;
        c1.color = c2.color;
        c2.color = c3.color;
    }
}

class CarTest {
    public static void main(String[] args) {
        Car car1 = new Car("blue", "v4", 2);
        Car car2 = new Car("black", "v12", 5);
        System.out.println("количество дверей у машины 1 было: " + car1.door);
        System.out.println("количество дверей у машины 2 было: " + car2.door);
        car1.changeDoor(4);
        car2.changeDoor(8);
        System.out.println("количество дверей у машины 1 стало: " + car1.door);
        System.out.println("количество дверей у машины 2 стало: " + car2.door);
        System.out.println("цвет певой машины был: " + car1.color);
        System.out.println("цвет второй машины был: " + car2.color);
        Car.swapColor(car1, car2);
        System.out.println("цвет первой машины стал: " + car1.color);
        System.out.println("цвет второй машины стал: " + car2.color);

    }
}
