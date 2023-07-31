
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfNumbers = 0;
        int sumOfNumbers = 0;
        while (true) {
            System.out.println("Give a number:");
            int newNumber = Integer.valueOf(scanner.nextLine());
            if (newNumber!=0) {
                countOfNumbers+=1;
                sumOfNumbers+=newNumber;
                continue;
            } else {
                break;
            }
        }
        System.out.println("Average of the numbers: " + ((float)sumOfNumbers/countOfNumbers));
    }
}
