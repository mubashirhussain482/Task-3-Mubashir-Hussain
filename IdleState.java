import java.util.Scanner;
public class IdleState implements ATMState {

    @Override
    public void insertCard(ATM atm) {
        System.out.println("Card inserted successfully.");
        atm.setState(new HasCardState());
    }

    @Override
    public void enterPin(ATM atm, String pin) {
        System.out.println("Please insert your card first.");
    }

    @Override
    public void handleTransaction(ATM atm, Scanner scanner) {
        System.out.println("Please insert your card first.");
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("No card inserted.");
    }
}