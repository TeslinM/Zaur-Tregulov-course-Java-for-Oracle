package lesson27;

public class Test6 {
    int a = 3;
    Test6() {
        a=4;
    }
    {a=5;}

    public static void main(String[] args) {
        Test6 t = new Test6();
        System.out.println(t.a);
    }
}

class A {
    static final int b = 10;

}

class B {
    static int c;
    static final int d;
    static final int e = 1;
    static final int f;

    static{
        c=5;
        d=3;
        f=7;
    }
}

class C {
    String s = "ok";

    {
        System.out.println(s);
    }
    static int i=0;
    static {
        System.out.println(i);
    }
    static {
        i=i+1;
        System.out.println(i);
    }
    C() {
        System.out.println("eto konstruktor");
    }

    public static void main(String[] args) {
        C c = new C();
    }
}