import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        /*
        scan is for user input for transaction option and also amount.
        */
        Scanner scan = new Scanner(System.in);
        int currentBalance = 1000; //initial amount is $1,000
        int amount = 0;
        int numberOfTransactions = 0;
        int transactionChoice = 0;
        FileWriter fw = new FileWriter("output.txt");
        PrintWriter pw = new PrintWriter(fw);
        System.out.println("Welcome to CIS-2348 Banking System!");
        System.out.print("Enter your Option in a number: ");
        do {


            System.out.print("Enter your Option in a number: ");
            System.out.println("1. Display Balance 2. Deposit Amount 3. Withdraw Amount");
            transactionChoice = scan.nextInt();
            switch (transactionChoice) {
                case 1:
                    System.out.println("Current Balance: $" + currentBalance);
                    break;
                case 2:
                    System.out.print("How much do you want to deposit: ");
                    amount = scan.nextInt();
                    numberOfTransactions++;
                    currentBalance += amount;
                    pw.println(numberOfTransactions + "         " + "Deposit" + "         " + amount + "$         " + currentBalance + '$');
                    break;
                case 3:
                    System.out.print("How much do you want to withdraw: ");
                    amount = scan.nextInt();
                    numberOfTransactions++;
                    currentBalance -= amount;
                    pw.println(numberOfTransactions + "         " + "Withdraw" + "        " + amount + "$         " + currentBalance + '$');
                    break;
                default:
                    pw.close();
                    System.out.println("Thank you and come again.");
                    return;
            }
        } while (transactionChoice != 0);
    }
}
