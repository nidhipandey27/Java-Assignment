import java.util.Scanner;

public class QuotientWithoutDivision {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

        int quotient = 0;
        boolean negative = (dividend < 0) ^ (divisor < 0);

        dividend = Math.abs(dividend);
        divisor = Math.abs(divisor);

        for (int i = 31; i >= 0; i--) {
            if ((dividend >> i) >= divisor) {
                dividend -= (divisor << i);
                quotient |= (1 << i);
            }
        }

        if (negative) quotient = -quotient;

        System.out.println(quotient);
    }
}

