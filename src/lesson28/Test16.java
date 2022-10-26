package lesson28;

import java.util.ArrayList;

public class Test16 {
    public static void main(String[] args) {
        //ArrayList<String> list = new ArrayList<>();
        //list.add("1");
        //list.add("2");
        //System.out.println(list.get(3));
        //System.out.println(5/0);
        //Doctor d = new Doctor();
        //Teacher t = new Teacher();
        //Teacher t3 = new Teacher();
        //Teacher[] array2 = {t3,t};
        //Employee[] array1 = {d,t};
        //Teacher t2 = (Teacher) array1[0];
        createPWD("23423425656534");
    }
    public static void createPWD(String pwd) {
        if(pwd.length()<6) {
            throw new IllegalArgumentException("Dlina perolya mala");
        }
        if(pwd.length()>12) {
            throw new IllegalArgumentException("Dlina perolya big");
        }
        System.out.println("Parol prinyat");
    }
}

class Employee {}
class Doctor extends Employee {}
class Teacher extends Employee {}

class Samolet {
    String sostoyanie = "v ojidanii";
    public void letet() {
        sostoyanie = "v vozduhe";
        System.out.println("samolet letit");
    }
    public void ojidat() {
        if(sostoyanie.equals("v vozduhe")) {
            throw new IllegalStateException("samolet uje v vozduhe");
        }
        sostoyanie = "v ojidanii";
        System.out.println("samolet v ojidanii poleta");
    }

    public static void main(String[] args) {
        Samolet s = new Samolet();
        s.letet();
        s.ojidat();
    }
}