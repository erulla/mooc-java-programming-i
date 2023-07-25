
import java.util.Scanner;

public class SquareRootOfSum {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer firstNumber = Integer.valueOf(scanner.nextLine());
        Integer secondNumber = Integer.valueOf(scanner.nextLine());
        System.out.println(Math.sqrt(firstNumber+secondNumber));
    }
}
