package lesson28;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Test8 {
    void abc() {
        try {
            File f = new File("test9.txt");
            System.out.println("obekt file sozdalsya");
            FileInputStream fis = new FileInputStream(f);
        }
        catch(FileNotFoundException e) {
            System.out.println("Exception poiman");
        }
        finally {
            System.out.println("Eto blok finally");
        }
    //public static void main(String[] args) {
        //}
   }
}

