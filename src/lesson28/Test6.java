package lesson28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test6 {
    public static void main(String[] args) {
        try {
            File f = new File("test8.txt");
            FileInputStream fis = new FileInputStream(f);
        }
        catch(FileNotFoundException e) {
            System.out.println("Poiman exception 1");
        }
        catch(NullPointerException e) {
            System.out.println("Poiman exception 2");
        }
    }
}
