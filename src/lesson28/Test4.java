package lesson28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test4 {
    public static void main(String[] args) {
        File f = new File("test9.txt");

        try {
            FileInputStream fis = new FileInputStream(f);
            System.out.println("Vsem horoshego dnya");
        }
        catch(FileNotFoundException e) {
            System.out.println("Bul poiman exception " + e);
        }
        finally {
            System.out.println("Eto finally blok");
        }

        System.out.println("danniy kod yje ne imeet otnoshenie k exception");
    }
}
