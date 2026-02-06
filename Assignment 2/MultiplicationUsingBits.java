import java.util.Scanner;

public class MultiplicationUsingBits {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int result = 0;
        boolean negative = false;

        if (a < 0) {
            a = -a;
            negative = !negative;
        }
        if (b < 0) {
            b = -b;
            negative = !negative;
        }

        while (b != 0) {
            if ((b & 1) == 1) {
                result = result + a;
            }
            a <<= 1;
            b >>= 1;
        }

        if (negative) result = -result;

        System.out.println(result);
    }
}
