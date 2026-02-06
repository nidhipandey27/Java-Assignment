import java.util.Scanner;

public class SmartBillingSystem {
   public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Welcome to Smart Billing System");
       System.out.println("Enter the price : ");
       int price = input.nextInt();
       System.out.println("Enter the quantity : ");
       int quantity = input.nextInt();
       double TotalBill = price + quantity;
       double discount = 0;
       if (TotalBill >= 2000) {
           System.out.println("will get 5% discount");
           discount = TotalBill * 0.10;
       } else if (TotalBill >= 5000) {
           System.out.println("will get 10% discount");
            discount = TotalBill * 0.5;
       } else{
           System.out.println("no discount");
       }

           double DiscountedAmount = TotalBill - discount;
           double gst = DiscountedAmount * 0.18;
           double TotalAmount = DiscountedAmount + gst;
           System.out.println("TotalAmount" + TotalAmount);
           System.out.println("discount" + discount);
           System.out.println("gst" + gst);
           System.out.println("FinalAmount" + TotalAmount);

   }
}
