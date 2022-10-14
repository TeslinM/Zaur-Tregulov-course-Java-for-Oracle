package lesson12;

public class Test10 {

    void max(int a, int b, int c) {
        if (a>b && a>c) {
            System.out.println("maximum - " +a);
        } else if(b>a && b>c) {
            System.out.println("maximum - " +b);
        } else {
            System.out.println("maximum - " +c);
        }
    }

    void abc() {
        String str;
        int a = 10;
        if (a>=10) {
            str = "privet";
        } else if (a<10) {
            str = "poka";
        } else {
            str = "draste";
        }
        System.out.println(str);
    }

    public static void main(String[] args) {
        int a = 20;
        int b = 20;
        int maximum = (a>b)?a:b;
        System.out.println(maximum);
    }
}
