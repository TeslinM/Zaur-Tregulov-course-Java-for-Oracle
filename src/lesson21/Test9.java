package lesson21;

import java.util.ArrayList;
import java.util.List;

public class Test9 {
    public static void main(String[] args) {
        ArrayList<String> al1 = new ArrayList<>();
        al1.add("one");
        al1.add("two");
        al1.add("three");
        al1.add("four");
        al1.add("five");

        List<String> list = List.of("odin", "dva", "tri");
        System.out.println(list);
        List<String> list2 = List.copyOf(al1);
        System.out.println(list2);
    }
}
