
import java.util.Scanner;

public class DivisibleByThree {

    public static void main(String[] args) {
        divisibleByThreeInRange(2, 10);

    }
    public static void divisibleByThreeInRange (int beginning, int end) {
        for (int i =0; i<=end; i+=3 ) {
            if (i>= beginning && i<= end) {
                System.out.println(i);
                continue;
            } else if (i< beginning){
                continue;
            } else {
                break;
            }
        }
    }
}

//better way
    // public static void divisibleByThreeInRange(int beginning, int end) {
    //     while (beginning <= end) {
    //         if (beginning % 3 == 0) {
    //             System.out.println(beginning);
    //         }
 
    //         beginning = beginning + 1;
    //     }
    // }
 