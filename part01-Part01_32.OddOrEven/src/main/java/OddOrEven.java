
import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Write your program here 
        System.out.println("Give a number:");
        Integer number = Integer.valueOf(scan.nextLine());
        boolean isOdd = (number%2 == 1 || number%2 == -1);
        if (isOdd) {
            System.out.println("Number " + number + " is odd");
        } else {
            System.out.println("Number " + number + " is even");
        }
    }
}
