package lesson15;

public class Test7 {
    public static void main(String[] args) {
        int money = 100;

        do{
            System.out.println("делайте ставку");
            System.out.println("вы проиграли");
            money-=10;
        }
        while(money>0);
    }
}
