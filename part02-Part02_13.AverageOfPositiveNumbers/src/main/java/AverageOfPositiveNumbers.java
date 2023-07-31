
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sumOfPositiveNumbers = 0;
        double count = 0;
        while (true) {
            double number = Integer.valueOf(scanner.nextLine());
            if (number == 0) {
                break;
            } else if (number>0) {
                sumOfPositiveNumbers += number;
                count+=1;
                continue;
            } else {
                continue;
            }
        }
        if (count!=0) {
            System.out.println(sumOfPositiveNumbers/count);
        } else {
            System.out.println("Cannot calculate average");
        }
    }
}
