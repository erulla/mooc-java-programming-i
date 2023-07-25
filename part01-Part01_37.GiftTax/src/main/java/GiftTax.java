
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double taxAmount = 0.0;
        System.out.println("Value of the gift?");
        Double amount = Double.valueOf(scan.nextLine());
        if (amount >= 1000000) {
            taxAmount = (amount -1000000)*0.17 + 142100;
            System.out.println("Tax: " + taxAmount);
        }  else if (amount >= 200000) {
            taxAmount = (amount -200000)*0.15 + 22100;
            System.out.println("Tax: " + taxAmount);
        }  else if (amount >= 55000) {
            taxAmount = (amount -55000)*0.12 + 4700;
            System.out.println("Tax: " + taxAmount);
        }  else if (amount >= 25000) {
            taxAmount = (amount -25000)*0.10 + 1700;
            System.out.println("Tax: " + taxAmount);
        }  else if (amount >= 5000) {
            taxAmount = (amount -5000)*0.08 + 100;
            System.out.println("Tax: " + taxAmount);
        } else {
            System.out.println("No tax!");
        }
    }
}
