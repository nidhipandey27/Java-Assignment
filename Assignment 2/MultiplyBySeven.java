import java.util.Scanner;

public class MultiplyBySeven {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = (n << 3) - n;

        System.out.println(result);
    }
}
