package lesson16;

public class Test1 {



    public static void main(String[] args) {
        String s1 = new String("abcdefgabcd");
        System.out.println(s1.length());

        char c1 = s1.charAt(2);
        System.out.println(c1);

        int i1 = s1.indexOf('t');
        System.out.println(i1);

        int i2 = s1.indexOf("vet");
        System.out.println(i2);

        int i3 = s1.indexOf("Z");
        System.out.println(i3);

        int i4 = s1.indexOf("a", 5);
        System.out.println(i4);

        boolean b1 = s1.startsWith("abd");
        System.out.println(b1);

        boolean b2 = s1.startsWith("abc", 7);
        System.out.println(b2);

        boolean b3 = s1.endsWith("cd");
        System.out.println(b3);


    }
}
