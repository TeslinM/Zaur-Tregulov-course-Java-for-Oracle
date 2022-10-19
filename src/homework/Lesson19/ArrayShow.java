package homework.Lesson19;

import java.util.Arrays;

public class ArrayShow {

    public static void showArray(String[][] array) {
        System.out.println(Arrays.deepToString(array));
    }

    public static void main(String[] args) {
        String[][] array1 = new String[][] {{"ok","bad","good"},{"like","well"},{"poll","ken"}};
        showArray(array1);
    }
}
