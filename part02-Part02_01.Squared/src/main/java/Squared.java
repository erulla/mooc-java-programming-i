
import java.util.Scanner;

public class Squared {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = Integer.valueOf(scanner.nextLine());
        // System.out.println(number*number); //without using math library
        System.out.println((int)Math.pow(number, 2));
    }
}
