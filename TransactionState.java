import java.util.Scanner;
public class TransactionState implements ATMState {

    @Override
    public void insertCard(ATM atm) {
        System.out.println("Transaction is already in progress.");
    }

    @Override
    public void enterPin(ATM atm, String pin) {
        System.out.println("PIN is already verified.");
    }

    @Override
    public void ejectCard(ATM atm) {
        System.out.println("Finish the transaction before ejecting the card.");
    }

    @Override
    public void handleTransaction(ATM atm, Scanner scanner) {

        boolean running = true;

        while (running) {

            atm.displayMenu();
            int choice = atm.readValidInt();

            switch (choice) {

                case 1:
                    System.out.printf("Current Balance: $%.2f%n",
                            atm.getAccount().getBalance());
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = atm.readValidDouble();

                    if (atm.getAccount().deposit(depositAmount)) {
                        System.out.println("Deposit successful.");
                        System.out.printf("Current Balance: $%.2f%n",
                                atm.getAccount().getBalance());
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;

                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = atm.readValidDouble();

                    if (atm.getAccount().withdraw(withdrawAmount)) {
                        System.out.println("Withdrawal successful.");
                        System.out.printf("Current Balance: $%.2f%n",
                                atm.getAccount().getBalance());
                    } else {
                        System.out.println("Invalid amount or insufficient balance.");
                    }
                    break;

                case 4:
                    System.out.println("Returning...");
                    atm.setState(new AuthenticatedState());
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }
    }
}