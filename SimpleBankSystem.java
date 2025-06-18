import java.util.Scanner;

public class SimpleBankSystem {

    static int balance = 0;
    static String pin = "";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Sameynta PIN
        System.out.print("Samee 4-digit PIN: ");
        pin = input.nextLine();

        // Hubinta PIN
        int attempts = 0;
        while (attempts < 3) {
            System.out.print("Gali PIN-ka: ");
            String entered = input.nextLine();

            if (entered.equals(pin)) {
                // Haddii sax yahay
                showMenu();
                return;
            } else {
                System.out.println("PIN-ka waa khalad.");
                attempts++;
            }
        }

        System.out.println("3 jeer ayaa la khalday. Nidaamka waa la xiray.");
    }

    public static void showMenu() {
        Scanner input = new Scanner(System.in);
        int choice = 0;

        while (choice != 4) {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Dooro: ");
            choice = input.nextInt();

            if (choice == 1) {
                deposit();
            } else if (choice == 2) {
                withdraw();
            } else if (choice == 3) {
                checkBalance();
            } else if (choice == 4) {
                System.out.println("Nabad gelyo! Mahadsanid.");
            } else {
                System.out.println("Doorasho khaldan.");
            }
        }
    }

    public static void deposit() {
        Scanner input = new Scanner(System.in);
        System.out.print("Gali lacagta la dhigayo: ");
        int amount = input.nextInt();
        if (amount > 0) {
            balance += amount;
            System.out.println("Lacagta waa la dhigay.");
        } else {
            System.out.println("Lacag sax ah gali.");
        }
    }

    public static void withdraw() {
        Scanner input = new Scanner(System.in);
        System.out.print("Gali lacagta la baxayo: ");
        int amount = input.nextInt();
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Lacagta waa la qaaday.");
        } else {
            System.out.println("Lacag kugu filan ma jirto ama qalad ayaa jira.");
        }
    }

    public static void checkBalance() {
        System.out.println("Balance-kaaga hadda waa: " + balance);
    }
}