package homework.Lesson19;
import java.util.Arrays;

public class Sort {
    public static int[] sortirovka(int[] array) {
        for(int i=0; i<array.length-1; i++) {
            for(int j=i+1; j<array.length; j++) {
                if(array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }

    public static void main(String[] args) {
        int[] array1 = new int[] {5,7,33,-20,-7,0};
        sortirovka(array1);
            System.out.println(Arrays.toString(array1));
    }
}
