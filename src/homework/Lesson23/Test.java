package homework.Lesson23;

class X3 {}
class Y3 {}

public class Test {
    public static void abc(X4 x, Y3 y) {
        System.out.println("privet");
    }

    public static void abc(Y3 y, X4 x) {
        System.out.println("poka");
    }

    public static void main(String[] args) {
        Y3 a = new Y3();
        //abc(a,a);
    }
}
