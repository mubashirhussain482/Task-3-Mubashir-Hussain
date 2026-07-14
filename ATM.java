import java.util.Scanner;
public class ATM {
    
    private ATMState currentState;
    private BankAccount account;
    private Scanner scanner;

    public ATM(BankAccount account) {
        this.account = account;
        this.currentState = new IdleState();
        this.scanner = new Scanner(System.in);
    }

    public void setState(ATMState state) {
        currentState = state;
    }

    public ATMState getCurrentState() {
        return currentState;
    }

    public BankAccount getAccount() {
        return account;
    }

    public void displayMenu() {
        System.out.println("\n===== ATM MENU =====");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Back");
        System.out.print("Enter your choice: ");
    }

    public int readValidInt() {
        while (!scanner.hasNextInt()) {
            System.out.print("Please enter a valid number: ");
            scanner.next();
        }

        int value = scanner.nextInt();
        scanner.nextLine();
        return value;
    }

    public double readValidDouble() {
        while (!scanner.hasNextDouble()) {
            System.out.print("Please enter a valid amount: ");
            scanner.next();
        }

        double value = scanner.nextDouble();
        scanner.nextLine();
        return value;
    }

    public void start() {

        boolean running = true;

        System.out.println("===== ATM System =====");

        while (running) {

            System.out.println("\n1. Insert Card");
            System.out.println("2. Enter PIN");
            System.out.println("3. Transaction");
            System.out.println("4. Eject Card");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = readValidInt();

            switch (choice) {

                case 1:
                    currentState.insertCard(this);
                    break;

                case 2:
                    System.out.print("Enter PIN: ");
                    String pin = scanner.nextLine();
                    currentState.enterPin(this, pin);
                    break;

                case 3:
                    currentState.handleTransaction(this, scanner);
                    break;

                case 4:
                    currentState.ejectCard(this);
                    break;

                case 5:
                    System.out.println("ATM closed.");
                    running = false;
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        scanner.close();
    }
}