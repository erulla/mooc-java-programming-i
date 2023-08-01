
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 1; i<=number; i++ ) {
            System.out.print("*");
        }
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i =0; i < number; i++) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int starCount = 1;
        for (int i=0; i< size; i++) {
            printSpaces(size-starCount);
            printStars(starCount);
            starCount +=1;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        int starCount = 1;
        int spaceCount =height -starCount;
        for (int i=0; i< height; i++) {
            printSpaces(spaceCount);
            printStars(starCount);
            starCount +=2;
            spaceCount -=1;
        }
        for (int i=0; i<2; i++) {
            printSpaces(((starCount+1)/2)-3);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(5);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}

//General method
// public static void printChristmasTree(int height) {
//     for(int i = 0; i < height; i++) {
//         // Print leading spaces
//         for(int j = 0; j < height - i - 1; j++) {
//             System.out.print(" ");
//         }
//         // Print stars
//         for(int j = 0; j < 2 * i + 1; j++) {
//             System.out.print("*");
//         }
//         System.out.println();
//     }
//     // Print the base
//     for(int i = 0; i < 2; i++) {
//         for(int j = 0; j < height - 2; j++) {
//             System.out.print(" ");
//         }
//         for(int j = 0; j < 3; j++) {
//             System.out.print("*");
//         }
//         System.out.println();
//     }
// }


//model solution

    // public static void printStars(int number) {
    //     // part 1 of the exercise
    //     int i = 0;
    //     while (i < number) {
    //         System.out.print("*");
    //         i++;
    //     }
    //     System.out.println("");
    // }
 
    // public static void printSpaces(int number) {
    //     // part 1 of the exercise
    //     int i = 0;
    //     while (i < number) {
    //         System.out.print(" ");
    //         i++;
    //     }
    // }
 
    // public static void printTriangle(int size) {
    //     // part 2 of the exercise
    //     // let's start from 1 because the first line should have one star!
    //     int i = 1;
    //     while (i <= size) {
    //         printSpaces(size - i);
    //         printStars(i);
    //         i++;
    //     }
    // }
 
    // public static void christmasTree(int height) {
    //     // part 3 of the exercise
    //     // Let's first print the top of the tree. 
    //     // This works almost like the triangle.
    //     int i = 1;
    //     while (i <= height) {
    //         printSpaces(height - i);
    //         printStars(i + (i - 1));
    //         i++;
    //     }
 
    //     // End then the bottom.
    //     printSpaces(height - 2);
    //     printStars(3);
    //     printSpaces(height - 2);
    //     printStars(3);
    // }
 