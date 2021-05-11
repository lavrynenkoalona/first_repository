package HW4;

import java.util.Scanner;

public class Task3HW4 {
    //Write 4 programs called T riangularPatternX (X = A, B, C, D) that prompts user
    // for the size (a non-negative integer in int); and prints each of the patterns as shown on picture below
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        //System.out.print("input n: ");
        //int n = input.nextInt();
        int n=5;
       picture1(n);
        System.out.println("");
        picture2(n);
        System.out.println("");
       picture3(n);
        System.out.println("");
            picture4(n);
    }

    private static void picture4(int r) {
        for (int i = 0; i < r; i++) {
            System.out.println("");
            {
                for (int j = 0; j <=r; j++) {
                    if (j<r-i) {
                        System.out.print("  ");
                    } else {
                        System.out.print("# ");
                    }
                }
            }

        }
    }

    private static void picture3(int z) {
        for (int i = 0; i <z; i++) {
            System.out.println("");
            for (int j = 0; j < z; j++) {
                if (i>j) {
                    System.out.print("  ");
                } else {
                    System.out.print("# ");
                }
            }
        }

    }


    private static void picture2(int k) {

        for (int i = 0; i <= k; i++) {
            for (int j = i; j <= k; j++) {
                System.out.print("j+1");
            }
            System.out.println(" ");
        }

        System.out.println();


    }

    private static void picture1(int t) {

        for (int i = 0; i < t; i++) {
            {
                System.out.println();

            }
            for (int j = 0; j <=i; j++) {
                System.out.print("# ");
            }

        }

    }
}




