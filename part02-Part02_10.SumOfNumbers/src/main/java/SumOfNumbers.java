
import java.util.Scanner;

public class SumOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int newNumber = Integer.valueOf(scanner.nextLine());
            if (newNumber!=0) {
                sumOfNumbers += newNumber;
                continue;
            } else {
                break;
            }
        }
        System.out.println("Sum of the numbers: " + sumOfNumbers);
    }
}
