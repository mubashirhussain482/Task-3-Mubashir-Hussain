import java.util.Scanner;
public class AuthenticatedState implements ATMState {

    @Override
    public void insertCard(ATM atm) {
        System.out.println("A card is already inserted.");
    }

    @Override
    public void enterPin(ATM atm, String pin) {
        System.out.println("PIN is already verified.");
    }

    @Override
    public void handleTransaction(ATM atm, Scanner scanner) {
        atm.setState(new TransactionState());
        atm.getCurrentState().handleTransaction(atm, scanner);
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Card ejected. Thank you!");
        atm.setState(new IdleState());
    }
}