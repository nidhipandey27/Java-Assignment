import java.util.Scanner;

public class MaximumWithoutComparison {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int diff = a - b;
        int k = (diff >> 31) & 1;

        int max = a - k * diff;

        System.out.println(max);
    }
}
