
public class Greatest {

    public static int greatest(int number1, int number2, int number3) {
        //write some code here
        int largest = Math.max(number1, Math.max(number2, number3));
        return largest;
    }

    public static void main(String[] args) {
        int result = greatest(2, 7, 3);
        System.out.println("Greatest: " + result);
    }
}

    // public static int greatest(int number1, int number2, int number3) {
    //     //write some code here
    //     int greatest = number1;
    //     if (number2 > greatest) {
    //         greatest = number2;
    //     }
    //     if (number3 > greatest) {
    //         greatest = number3;
    //     }
    //     return greatest;
 
    // }
    // model solution