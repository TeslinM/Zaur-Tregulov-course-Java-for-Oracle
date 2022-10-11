package lesson5;

public class Car2 {
    String color;
    String engine;
    int speed;

    int gaz(int a) {
        speed +=a;
        return speed;
    }

    int tormoz(int a) {
        speed -= a;
        return speed;
    }

    void showInfo() {
        System.out.println("cvet: " + color + " motor: " + engine + " skorost: " + speed);
    }

    static class Car2Test {
        public static void main(String[] args) {
            Car2 car2 = new Car2();
            car2.color = "white";
            car2.engine = "v6";
            car2.speed = 60;
            car2.gaz(100);
            car2.showInfo();

        }
    }
}
