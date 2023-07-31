
import java.util.Scanner;

public class RepeatingBreakingAndRemembering {

    public static void main(String[] args) {
        System.out.println(1+1);
        // This exercise is worth five exercise points, and it is 
        // gradually extended part by part.
        
        // If you want, you can send this exercise to the server
        // when it's just partially done. In that case the server will complain about 
        // the parts you haven't done, but you'll get points for the finished parts.
        int sumOfNumbers =0;
        int count = 0;
        int even = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Give numbers:");
        while (true) {
            int giveNumber = Integer.valueOf(scanner.nextLine());
            if (giveNumber!=-1) {
                sumOfNumbers+=giveNumber;
                count+=1;
                if (giveNumber%2==0) {
                    even+=1;
                }
                continue;
            } else {
                break;
            }
        }
        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sumOfNumbers);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + (double)sumOfNumbers/count);
        System.out.println("Even: " + even);
        System.out.println("Odd: " + (count-even));
    }
}
