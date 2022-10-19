package homework.Lesson21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class HomeWork {
    public static ArrayList<String> abc(String ... a) {
        ArrayList<String> list = new ArrayList<String>();
        for(String p : a) {
            if(!list.contains(p)) {
                list.add(p);
            }
        }
        Collections.sort(list);
        System.out.println(list);
        return list;
    }

    public static void main(String[] args) {
        abc("d", "c", "b", "a", "e", "d", "a");
    }
}
