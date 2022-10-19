package lesson21;

import java.util.HashMap;
import java.util.Map;

public class Test11 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(777, "ivanov mikhail");
        map.put(778, "zaur tregulov");
        map.put(779, "sidorova maria");
        map.put(780, "petrov petr");
        map.put(779, "roberto carlos");
        map.remove(779);
        System.out.println("map = " + map);
    }
}
