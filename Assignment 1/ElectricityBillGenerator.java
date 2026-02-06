import java.util.Scanner;

public class ElectricityBillGenerator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        int bill = 0;

        if (units <= 100) {
            bill = units * 2;

        } else if (units <= 200) {
            bill = (100 * 2) + (units - 100) * 3;

        } else {
            bill = (100 * 2) + (100 * 3) + (units - 200) * 5;

        }

        bill += 150; // fixed meter charge

        System.out.println("Total Electricity Bill: " + bill);
    }
}
