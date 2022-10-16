package lesson15;

import java.sql.SQLOutput;

public class Test2 {
    public static void main(String[] args) {
        int money = 100;

        while(money>0) {
            System.out.println("делайте ставку");
            System.out.println("Вы проиграли");
            money-=10;
        }
    }
}
