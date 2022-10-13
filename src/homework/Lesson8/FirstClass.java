package homework.Lesson8;

public class FirstClass {
    public static int ymnogenie(int a, int b, int c) {
        int result = a*b*c;
        return result;
    }

    public static void delenie(int a, int b) {
        int result1 = a/b;
        int result2 = a%b;
        System.out.println("celoe chislo: " + result1 + "   ostatok ot delenia : " + result2);
    }
}

class FirstClassTest {
    public static void main(String[] args) {
        System.out.println("rezultat umnogenia: " + FirstClass.ymnogenie(3,4,5));
        FirstClass.delenie(6, 4);

        System.out.println("rezultat umnogenia: " + FirstClass.ymnogenie(4,5,6));
        FirstClass.delenie(10, 8);
    }
}
