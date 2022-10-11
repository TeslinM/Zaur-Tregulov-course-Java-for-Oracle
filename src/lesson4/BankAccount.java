package lesson4;

public class BankAccount {
    int id;
    String name =  new String("petr");
    double balance;

    double popolnenieScheta(double value) {
        balance += value;
        return balance;
    }

    double snyatieSoScheta(double value) {
        balance -= value;
        return balance;
    }

}

class BankAccountTest {

    public static void main(String[] args) {
        BankAccount MyAccount = new BankAccount();
        BankAccount YourAccount = new BankAccount();
        BankAccount HisAccount = new BankAccount();

        MyAccount.id = 1;
        MyAccount.balance = 12.35;
        MyAccount.popolnenieScheta(200.21);
        System.out.println("Balans pervogo posle popolnenia: " + MyAccount.balance);
        MyAccount.snyatieSoScheta(47.65);
        System.out.println("Balans pervogo posle snyatia: " + MyAccount.balance);

        YourAccount.id = 2;
        YourAccount.name = "Mike";
        YourAccount.balance = 32.21;
        YourAccount.popolnenieScheta(45.36);
        System.out.println("Balans vtorogo posle popolnenia: " + YourAccount.balance);
        YourAccount.snyatieSoScheta(14.36);
        System.out.println("Balans vtorogo posle snyatia: " + YourAccount.balance);

        HisAccount.id = 3;
        HisAccount.name = "Ivan";
        HisAccount.balance = 852.14;
        HisAccount.popolnenieScheta(12.21);
        System.out.println("Balans tret'ego posle popolnenia: " + HisAccount.balance);
        HisAccount.snyatieSoScheta(11.22);
        System.out.println("Balans tret'ego posle snyatia: " + HisAccount.balance);
    }
}
