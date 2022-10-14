package lesson4;

public class Car {
    public Car (String cvet, String motor) {
        color = cvet;
        engine = motor;
        System.out.println("Цвет машины: " + color + "    мотор машины: " + engine);
    }

    public Car() {

    }

    String color;
    String engine;
}

class carTest {
    public static void main(String[] args) {
        Car car1 = new Car("black", "v12");
        Car car2 = new Car("white", "v1");


    }
}
