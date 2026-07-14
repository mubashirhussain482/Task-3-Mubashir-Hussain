import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("PK-76-BUFF-9900", 500.00);

        ATM atm = new ATM(account);

        atm.start();
    }
}