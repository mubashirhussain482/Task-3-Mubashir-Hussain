import java.util.Scanner;
public interface ATMState {

    void insertCard(ATM atm);

    void enterPin(ATM atm, String pin);

    void handleTransaction(ATM atm, Scanner scanner);

    void ejectCard(ATM atm);

}