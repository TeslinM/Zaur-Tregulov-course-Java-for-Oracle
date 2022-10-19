package lesson19;

public class Test6 {

    public static void maxMin(double[] array) {
        double max=array[0];
        double min=array[0];
        for(int i=1; i<array.length;i++) {
            if(array[i]>max) {
                max=array[i];
            }
            if(array[i]<min) {
                min=array[i];
            }
        }
        System.out.println("min: " + min + "max: " + max);

    }

    public static void main(String[] args) {
        double[] ar = {5,4,1,99,666666,-200,3,56,88};
        maxMin(new double[] {5,4,1,99,666666,-200,3,56,88});
    }
}
