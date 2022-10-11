package homework;

public class Lesson2 {
    public static void main(String[] args) {
        byte b1 = 12;
        byte b2 = 0xc;
        byte b3 = 014;
        byte b4 = 0b1100;

        System.out.print(b1);
        System.out.print(b2);
        System.out.print(b3);
        System.out.println(b4);

        short s1 = 1300;
        short s2 = 0x514;
        short s3 = 02424;
        short s4 = 0b010100010100;

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);

        int i1 = 0;
        int i2 = 0x0;
        int i3 = 00;
        int i4 = 0b0;

        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);

        long l1 = 123456789;
        long l2 = 0x75BCD15;
        long l3 = 0726746425;
        long l4 = 0b111010110111100110100010101;

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);
        System.out.println(l4);

        double d1 = 0.2;
        double d2 = 0.3;

        float f1 = 4.5f;
        float f2 = 5.6f;

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(d1);
        System.out.println(d2);
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(bool1);
        System.out.println(bool2);

        char c1 = 'a';
        char c2 = '\u1234';
        char c3 = 333;

        System.out.println(c1);
        System.out.println(c2);
        System.out.println(c3);

    }
}