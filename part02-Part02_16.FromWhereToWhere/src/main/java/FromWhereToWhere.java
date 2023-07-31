
import java.util.Scanner;

public class FromWhereToWhere {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Where to?");
        int ceiling = Integer.valueOf(scanner.nextLine());
        System.out.println("Where from?");
        int floor = Integer.valueOf(scanner.nextLine());
        for (int i=floor; i<=ceiling; i++) {
            System.out.println(i);
        }
    }
}
