
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Write your program here
        System.out.println("Give the first number:");
        Integer firstInteger = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the second number:");
        Integer secondInteger = Integer.valueOf(scanner.nextLine());
        System.out.println("Give the third number:");
        Integer thirdInteger = Integer.valueOf(scanner.nextLine());
        System.out.println("The sum of the numbers is " + (thirdInteger + firstInteger + secondInteger) );
    }
}
