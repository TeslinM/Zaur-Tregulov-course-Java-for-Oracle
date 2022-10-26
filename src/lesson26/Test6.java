package lesson26;

public class Test6 {
    public static void main(String[] args) {
        byte b = 10;
        int a = b;
        //System.out.println(7);
        byte b2 = 3;
        short s1 = -6;
        char c1 = 100;
        int i1 = 3;
        short s2 = (short) i1;
        long l1 = 1;
        int i2 = (int) l1;

        int i10 = 111111;
        short s10 = (short) i10;
        //System.out.println(s10);


        char c10 = (char) -8;
        System.out.println(c10);
        int i11 = (int) 3.14;
        System.out.println(i11);

        double d = 5345345.563;
        byte b12 = (byte) d;
        System.out.println(b12);

        int i = 2147483647;
        System.out.println(i+1);
        System.out.println(i+2);

        int i5 = 5;
        long l2 = 10;
        i5*=l2;
        System.out.println(i5+l2);

        float f = 3.14f;
        int i4 = 10;
        System.out.println(f+i4);

        byte b3 = 3;
        short s5= 4;
        char c6=5;
        System.out.println(b3+s5+c6);
        System.out.println(c6--);

        byte b7=10;
        float f2=7f;
        double d7=2.0;
        System.out.println(b7+f2-d7);

        double d9=3.14;
        float f9=6.28f;

        float f11 = 0*1.5f;




    }
}
