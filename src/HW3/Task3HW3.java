package HW3;

import java.util.Scanner;

public class Task3HW3 {
    //Write a Java program that takes a year from user and print whether that year is a leap year or not.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("input year");
        int year = input.nextInt();
        if (isYearLeap(year)) {
            System.out.print("Year is leap");
        } else {
            System.out.print("Year is not leap");
        }
    }

    private static boolean isYearLeap(int y) {
            return (y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0) );
    }
}
