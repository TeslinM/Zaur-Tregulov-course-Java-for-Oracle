package lesson20;

public class Test2 {
    static void summa(int ... a) {
        int summa = 0;
        for(int i=0; i<a.length; i++) {
            summa+=a[i];
        }
        System.out.println(summa);
    }

    public static void main(String[] args) {
        summa(4,3,2,4,55,55,3);
    }
}
