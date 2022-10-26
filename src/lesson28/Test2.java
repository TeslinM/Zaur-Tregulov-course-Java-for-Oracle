package lesson28;

import javax.crypto.NullCipher;

public class Test2 {
    public static void main(String[] args) {
        int[] array = {1,2,3};
        String s = null;
        try {
            System.out.println(s.length());
        }
        catch(NullPointerException e) {
            System.out.println("Eto bulo iskluchenie");
        }
        System.out.println("hello");
    }
}
