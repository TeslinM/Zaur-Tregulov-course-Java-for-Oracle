package homework.Lesson15;

public class Time {

    public static void time() {
        int chas = 0;

        OUTER:
        while(chas<6) {
            int minuta = 0;
            MIDDLE:
            do {
                if(chas > 1 && minuta % 10==0) {
                    break OUTER;
                }
                int secunda = 0;
                INNER:
                while(secunda<60) {
                    System.out.println(chas + ":" + minuta + ":" + secunda);
                    secunda++;
                }
                minuta++;
            }
            while(minuta<60);
            chas++;
        }
    }

    public static void main(String[] args) {
        Time time = new Time();
        time.time();
    }
}