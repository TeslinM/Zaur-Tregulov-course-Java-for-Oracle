package lesson9;

public class Student {
        public int a = 10;
        public static int c = 5;
        static int f = c;
        public int z = this.c;

}

class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3;
        st1 = null;
        String s = "privet";

    }
}
