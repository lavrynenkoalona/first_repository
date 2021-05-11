package HW4; // 5. Write program which print out next image using loops:
//    *
//   * *
//  * * *
// * * * *
//* * * * *

import java.util.Scanner;

public class HW4Task5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number (e.g. 5):");
        int z = input.nextInt();
        for (int i = 0; i < z; i++) {
            for (int j = 0; j < z - i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print("* ");
            }
            for (int t = 0; t <= z; t++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}