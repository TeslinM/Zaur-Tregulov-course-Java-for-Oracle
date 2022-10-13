package homework.Lesson8;

public class Zadacha2 {
    public static final double PI = 3.14;

    public double radiusKruga(double znachenieRadiusa) {
        double valueRadius = PI * znachenieRadiusa * znachenieRadiusa;
        return valueRadius;
    }

    public static double dlina(double radius) {
        double square = 2 * PI * radius;
        return square;
    }

    public void infoRadius(double radius) {
        System.out.println("radius raven: " + radius);
        System.out.println("ploshad kruga ravna: " + radiusKruga(radius));
        System.out.println("dlina okrugnosti ravna: " + dlina(radius));
    }
}

class Zadacha2Test {
    public static void main(String[] args) {
        Zadacha2 z = new Zadacha2();
        z.radiusKruga(5.4);
        Zadacha2.dlina(7.5);
        z.infoRadius(3.3);
    }
}