import java.util.Scanner;
public class HasCardState implements ATMState {

    private static final String CORRECT_PIN = "1234";

    @Override
    public void insertCard(ATM atm) {
        System.out.println("A card is already inserted.");
    }

    @Override
    public void enterPin(ATM atm, String pin) {
        if (CORRECT_PIN.equals(pin)) {
            System.out.println("PIN verified successfully.");
            atm.setState(new AuthenticatedState());
        } else {
            System.out.println("Incorrect PIN. Try again.");
        }
    }

    @Override
    public void handleTransaction(ATM atm, Scanner scanner) {
        System.out.println("Please enter your PIN first.");
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Card ejected.");
        atm.setState(new IdleState());
    }
}