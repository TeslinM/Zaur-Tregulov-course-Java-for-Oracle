package lesson4;

public class BankAccount {
    int id;
    String name =  new String("petr");
    double balance;

}

class BankAccountTest {

    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.balance = 12.35;

        YourAccount.id = 2;
        YourAccount.name = "Mike";
        YourAccount.balance = 32.21;

        HisAccount.id = 3;
        HisAccount.name = "Ivan";
        HisAccount.balance = 852.14;

        System.out.println(MyAccount.name);
    }
}
