
public class StarSign {

    public static void main(String[] args) {

        
        //The tests are not checking the main, so you can modify it freely.
        //NB: If the tests don't seem to pass, you should try the methods here
        //in the main to make sure they print the correct shapes!
        
        printStars(3);
        System.out.println("\n---");  // printing --- between the shapes
        printSquare(4);
        System.out.println("\n---");
        printRectangle(5, 6);
        System.out.println("\n---");
        printTriangle(3);
        System.out.println("\n---");
    }

    public static void printStars(int number) {
        // first part of the exercise
        for (int i = 0; i<number; i++) {
            System.out.print("*");
        }
        System.out.print("\n");
    }

    public static void printSquare(int size) {
        // second part of the exercise
        for (int i = 0; i<size; i++) {
            System.out.println("*".repeat(size));
        }
    }

    public static void printRectangle(int width, int height) {
        // third part of the exercise
        for (int i = 0; i<height; i++) {
            System.out.println("*".repeat(width));
        }
    }

    public static void printTriangle(int size) {
        // fourth part of the exercise
        for (int i = 1; i<=size; i++) {
            System.out.println("*".repeat(i));
        }
    }
}
//model solution
    // public static void printStars(int number) {
    //     // first part of the exercise
    //     int countPrinted = 0;
    //     while (countPrinted < number) {
    //         System.out.print("*");
    //         countPrinted = countPrinted + 1;
    //     }
    //     System.out.println("");
    // }
 
    // public static void printSquare(int size) {
    //     // second part of the exercise
    //     int countPrinted = 0;
    //     while (countPrinted < size) {
    //         printStars(size);
    //         countPrinted = countPrinted + 1;
    //     }
    // }
 
    // public static void printRectangle(int width, int height) {
    //     // third part of the exercise
    //     int countPrinted = 0;
    //     while (countPrinted < height) {
    //         printStars(width);
    //         countPrinted = countPrinted + 1;
    //     }
    // }
 
    // public static void printTriangle(int size) {
    //     // fourth part of the exercise
    //     int line = 1;
    //     while (line <= size) {
    //         printStars(line);
    //         line = line + 1;
    //     }
    // }

//double for loop if you have different length/height
// public static void printRectangle(int width, int height) {
//     for(int i = 0; i < height; i++) {
//         for(int j = 0; j < width; j++) {
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }
