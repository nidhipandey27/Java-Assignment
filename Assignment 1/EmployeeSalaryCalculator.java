
    import java.util.Scanner;
    public class EmployeeSalaryCalculator{

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            System.out.print("Enter basic salary: ");
            double basicSalary = sc.nextDouble();

            double hra;
            double da;

            if (basicSalary >= 30000) {
                hra = basicSalary * 0.20;
                da = basicSalary * 0.15;
            } else {
                hra = basicSalary * 0.10;
                da = basicSalary * 0.08;
            }

            double pf = basicSalary * 0.12;

            double netSalary = basicSalary + hra + da - pf;

            System.out.print("Net Salary is: " + netSalary);
        }
    }

