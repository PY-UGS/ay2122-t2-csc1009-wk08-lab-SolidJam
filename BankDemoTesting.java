import java.util.InputMismatchException;
import java.util.Scanner;

public class BankDemoTesting {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        CheckingAccount ca = new CheckingAccount();
        try{
            //USER INPUT
            System.out.print("Enter amount to deposit: $");
            double amountDeposit = sc.nextDouble();
            //CATCH INVALID INPUT (IF INPUT IS NEGATIVE
            if (amountDeposit < 0)
                throw new IllegalArgumentException("Entered amount must be a positive number");
            //DEPOSIT AMOUNT
            ca.deposit(amountDeposit);
            System.out.println("Deposited $" + String.format("%.2f", amountDeposit) + " into the account\n");

            //USER INPUT FOR WITHDRAWAL AMOUNT
            System.out.print("Enter amount for withdrawal: $");
            double amountWithdraw = sc.nextDouble();

            //CATCH INVALID INPUT IF AMOUNT LESS THAN 0
            if (amountWithdraw < 0)
                throw new IllegalArgumentException("Entered amount must be a positive number");

            //PRINT WITHDRAWAL AMOUNT
            System.out.println("Withdrew $" + String.format("%.2f", amountWithdraw) + " from the account\n");

            //PRINT SUCCESSFUL WITHDRAWAL
            System.out.println("The balance after withdrawal is: $" + String.format("%.2f", ca.withdraw(amountWithdraw)));

        } catch (InputMismatchException e) {
            //CATCH INPUT MISMATCH
            System.out.println("Input must be a number");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (InsufficientFundsException e) {
            //PRINT WITHDRAWAL UNSUCCESSFUL DUE TO ERROR
            System.out.println("Sorry, but your account is short by: $" + String.format("%.2f", ca.getAmount()));
        }
    }
}
