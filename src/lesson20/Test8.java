package lesson20;

public class Test8 {
    public static void main(String[] args) {
        int[] array = new int[4];
        for(int b : array) {
            b*=20;
        }

        for(int a:array) {
            System.out.println(a+ " ");
        }
    }
}
