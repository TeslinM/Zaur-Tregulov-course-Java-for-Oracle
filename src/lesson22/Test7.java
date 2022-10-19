package lesson22;

public class Test7 {
    public static void abc(int a, double b) {
        System.out.println("privet");
    }

    public static void abc(double b, int a) {
        System.out.println("poka");
    }

    public static void main(String[] args) {
        Test7 t = new Test7();
        t.abc(1,2.0);
    }
}