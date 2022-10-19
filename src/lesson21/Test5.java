package lesson21;
import java.util.ArrayList;

public class Test5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add(new String("poka"));
        list.add(new String("privet"));
        list.add(new String("ok"));
        list.add(new String("hello"));

            System.out.print(list.toString());

        System.out.println();
        System.out.println(list.indexOf(new String("poka")));

    }
}
