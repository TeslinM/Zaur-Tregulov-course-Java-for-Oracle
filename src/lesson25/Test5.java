package lesson25;

public class Test5 {
}

interface I1 {
    default void abc() {
        System.out.println("eto metod abc");
    }
    static void def() {
        System.out.println("static method");
    }
}

interface I2 extends I1 {
    void abc();
}

abstract class R implements I1 {
    public void abc() {
        System.out.println();
    }
}

class Z2 implements I1 {
    public void abc() {
        System.out.println("eto metod abc");
    }

    public static void main(String[] args) {
        Z2 z = new Z2();
        z.abc();
        //z.def();
    }
}
