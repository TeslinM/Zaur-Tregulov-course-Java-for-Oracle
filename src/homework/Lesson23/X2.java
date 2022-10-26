package homework.Lesson23;

public class X2 {
    public X2() {
        System.out.println("X");
    }

    public X2(int i) {
        System.out.println("X" + i);
    }

    private boolean abc() {
        return false;
    }

    public static void main(String[] args) {
        //X2 x = new Y2(18);
        //System.out.println(x.abc());
    }
}

class Y2 extends X2 {
    //public Y(int i) {
        //System.out.println("Y");
    //}

    public boolean abc() {
        return true;
    }
}
