import java.io.*;
import java.util.Scanner;

public class ATMSystem{
    // Initializing account details
    static int pin = 1234;
    static float acc_bal = 57890.70f;
    static long acc_num = 123456789L;
    static final float min_bal = 1000.0f;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hello Customer with Account number: " + acc_num);

        System.out.print("Please enter your 4-digit pin: ");
        int userPin = sc.nextInt();

        if (userPin == pin) {
            int choice;
            do {
                System.out.println("1. Deposit\n2. Withdraw\n3. Mini Statement\n4. Check Balance\n5. Quit");
                System.out.print("Enter your choice: ");
                choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        System.out.print("Enter amount to deposit: ");
                        float depositAmount = sc.nextFloat();
                        acc_bal += depositAmount;
                        System.out.println("Amount deposited successfully. Updated balance: " + acc_bal);
                        break;
                    case 2:
                        System.out.print("Enter amount to withdraw: ");
                        float withdrawAmount = sc.nextFloat();
                        if (acc_bal - withdrawAmount < min_bal) {
                            System.out.println("Minimum balance constraint violated. Cannot withdraw.");
                        } else {
                            acc_bal -= withdrawAmount;
                            System.out.println("Amount withdrawn successfully. Updated balance: " + acc_bal);
                        }
                        break;
                    case 3:
                        System.out.println("Account Number: " + acc_num + ", Balance: " + acc_bal);
                        break;
                    case 4:
                        System.out.println("Balance: " + acc_bal + ", Allowed to withdraw: " + (acc_bal - min_bal));
                        break;
                    case 5:
                        System.out.println("Thank you for using our ATM. Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice! Please try again.");
                }
            } while (choice != 5);
        } else {
            System.out.println("Invalid PIN. Exiting program.");
        }
    }
}
