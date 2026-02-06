import java.util.Scanner;

public class NumberClassificationTool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("==Number Classification Tool==");
        System.out.println("Enter the integer: ");

        // Taking required inputs from the user
        int number = sc.nextInt();

        // Checking if the number is positive or negative
        if(number>0){
            System.out.print("The number is positive\n");
        } else if(number<0){
            System.out.print("The number is negative\n");
        }

        // Checking if the number is odd or even
        if (number%2 == 0){
            System.out.print("The number is even\n");
        } else if(number%2 == 1){
            System.out.print("The number is odd\n");
        }

        // Checking if the number is divisible by 5 and 7
        if (number%5 == 0 && number%7 == 0){
            System.out.print("The number is divisible by 5 and 7");
        } else {
            System.out.print("The number is not divisible by 5 and 7");
        }
    }
}

