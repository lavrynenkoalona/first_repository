package HW8;

import java.util.Scanner;

public class Task1HW8 {

    private final static String PRINT_SYMBOL = "# ";
    private final static String EMPTY_SYMBOL = "  ";

    //1. Write program that prompts user for the size (a non-negative integer in int) and prints pattern as shown:
    public static void main(String[] args) {
        //Scanner input = new Scanner(System.in);
        //int n = input.nextInt();
        // if ( n< 1){
        //System.out.println("We can't print pattern with such value");
        //} else {
        int n = 9;
        firtFigure(n);
        System.out.println("===================================");
         secondFigure(n);
        System.out.println("===================================");
        thirdFigure(n);
        System.out.println("===================================");
    }

    private static void thirdFigure(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = n-1; j >= 0; j--) {
                if (i == 0 || i == (n - 1) || j == i) {
                    System.out.print(PRINT_SYMBOL);
                } else {
                    System.out.print(EMPTY_SYMBOL);
                }
            }
            System.out.println(EMPTY_SYMBOL);
        }
    }

    private static void secondFigure(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == (n - 1) || j == i) {
                    System.out.print(PRINT_SYMBOL);
                } else {
                    System.out.print(EMPTY_SYMBOL);
                }
            }
            System.out.println();
        }

    }

    private static void firtFigure(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == (n - 1) || j == 0 || j == (n - 1)) {
                    System.out.print(PRINT_SYMBOL);
                } else {
                    System.out.print(EMPTY_SYMBOL);
                }
            }
            System.out.println();
        }
    }

}



