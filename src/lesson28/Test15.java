package lesson28;

public class Test15 {
    void marafon(int temperatura, int tempBega) throws PodvernutNogu {
        if(tempBega>12) {
            throw new PodvernutNogu();
        }
        if(temperatura>32) {
            throw new SveloMishcu();
        }
        System.out.println("vu probegali marafon");
    }

    public static void main(String[] args) {
        Test15 t = new Test15();
        try {
            t.marafon(10, 20);
        }
        catch(PodvernutNogu e) {
            System.out.println(e.getMessage());
        }
    }
}

class PodvernutNogu extends Exception {
    PodvernutNogu(String message) {
        super(message);
    }
    PodvernutNogu() {
    }
}

class SveloMishcu extends RuntimeException {
    SveloMishcu(String message) {
        super(message);
    }
    SveloMishcu() {
    }
}