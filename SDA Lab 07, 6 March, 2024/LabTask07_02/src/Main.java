import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = scan.nextLine();
        System.out.println("Enter your date of birth (dd-mm-yyyy):");
        LocalDate dob = LocalDate.parse(scan.nextLine(), DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.println("Enter your initial balance:");
        double balance = scan.nextDouble();
        scan.nextLine();

        Account account = new Account(name, dob, balance);

        boolean continue_operations = true;
        while (continue_operations) {
            System.out.println("\n1. Display Balance\n2. Deposit Amount \n3. Withdraw Amount\n4. Exit\nEnter your choice: ");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("Balance: " + account.get_balance());
                    break;
                case 2:
                    System.out.print("Enter amount to deposit: ");
                    account.deposit_amount(scan.nextDouble());
                    System.out.println("Amount deposited, new balance: " + account.get_balance());
                    break;
                case 3:
                    System.out.print("Enter amount to withdraw: ");
                    double withdraw_amount = scan.nextDouble();
                    if (account.withdraw_amount(withdraw_amount))
                        System.out.println("Amount withdrawn, new balance: " + account.get_balance());
                    else
                        System.out.println("Insufficient balance.");
                    break;
                case 4:
                    continue_operations = false;
                    break;
                default:
                    System.out.println("Invalid choice. please try again.");
            }
        }
        scan.close();
    }
}
