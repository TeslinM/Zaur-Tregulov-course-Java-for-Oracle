package homework.Lesson6;

public class Overloaded {
    void sum() {
        System.out.println("Summa chisel: 0");
    }

    void sum(int a) {
        System.out.println("Summa chisel: " + a);
    }

    void sum(int a, int b) {
        System.out.println("Summa chisel: "+ (a+b));
    }

    void sum(int a, int b, int c) {
        System.out.println("Summa chisel: " + (a+b+c));
    }

    void sum(int a, int b, int c, int d) {
        System.out.println("Summa chisel: " + (a+b+c+d));
    }
}

class OverloadedTest {
    public static void main(String[] args) {
        Overloaded oL1 = new Overloaded();
        Overloaded oL2 = new Overloaded();
        Overloaded oL3 = new Overloaded();
        Overloaded oL4 = new Overloaded();
        Overloaded oL5 = new Overloaded();
        oL1.sum();
        oL2.sum(1);
        oL3.sum(1, 2);
        oL4.sum(1, 2, 3);
        oL5.sum(1, 2, 3, 4);

    }
}
