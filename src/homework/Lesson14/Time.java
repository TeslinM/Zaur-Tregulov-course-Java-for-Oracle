package homework.Lesson14;

public class Time {

    public void time() {
        Outer: for(int chas=0; chas<=6; chas++) {
            Inner1: for(int minuta=0; minuta<=59; minuta++) {
                if(chas > 1 && minuta % 10 == 0) {
                    break Outer;
                }
                Inner2: for(int secunda=0; secunda<=59; secunda++) {
                    if(secunda*chas>minuta) {
                        break Inner2;
                    }
                    System.out.println(chas + ":" + minuta + ":" + secunda);
                }
            }
        }
    }

    public static void main(String[] args) {
        Time time = new Time();
        time.time();
    }
}
