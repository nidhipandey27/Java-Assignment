import java.util.Scanner;

public class ATMWithdrawalSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter account balance: ");
        int balance = sc.nextInt();

        System.out.print("Enter withdrawal amount: ");
        int withdraw = sc.nextInt();

        if (withdraw % 100 == 0 && balance - withdraw >= 1000) {

            balance = balance - withdraw;
            System.out.println("Withdrawal successful");
            System.out.println("Remaining balance: " + balance);

        } else {

            System.out.println("Withdrawal failed");

        }
    }
}
