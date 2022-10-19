package homework.Lesson18;

public class Homework {
    public static boolean ravenstvo(StringBuilder a, StringBuilder b) {
        return a.toString().equals(b.toString());
    }

    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder(sb1);
        StringBuilder sb4 = new StringBuilder("house");
        System.out.println(ravenstvo(sb1,sb2));

    }
}
