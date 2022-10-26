package lesson24;

public class A10 {
    String s1 = "privet";
    static double d1 = 3.5;
    int summa (int ... i) {
        int result = 0;
        for(int a:i) {
            result+=a;
        }
        return result;
    }
    static void abc() {
        System.out.println("static method");
    }
}

class B10 extends A10 {
    String s1 = super.s1+", drug!";
    int summa(int ... i) {
        return 0;
    }

    public static void main(String[] args) {
        B10 b = new B10();
        System.out.println(b.s1);
    }
}