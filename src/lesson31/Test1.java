package lesson31;

import java.util.ArrayList;

public class Test1 {
    public static void main(String[] args) {
        //ArrayList<String> al = new ArrayList<>();
        Info<String> info1 = new Info<>("privet");
        System.out.println(info1);
    }
}

class Info <T> {
    private T value;
    public Info(T value) {
        this.value=value;
    }

    public String toString() {
        return "[{" + value + "}]";
    }
}