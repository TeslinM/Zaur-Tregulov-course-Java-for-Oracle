package homework.Lesson22;
import homework.Lesson23.*;

public class Y1 extends X1 {

    @Override
    public void abc() {
        System.out.println("Y");
    }

    public void def() {
        Y1 y = new Y1();
        y.abc();
    }

    public void ghi() {
        X1 x = new Y1();
        //x.abc();
    }

    public static void main(String[] args) {
        Y a = new Y();
        a.abc();
        //a.def();
        //a.ghi();
    }
}
