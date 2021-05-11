package HW3;

import java.util.Scanner;

public class Task4HW3 {
    //Write a program which take number of month from user and print out name of season (summer, winter ...)
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("month number:");
        int month_number = input.nextInt();
        switch (month_number) {
            case 1:
            case 2:
            case 12:
                System.out.println("winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("autumn");
                break;
            default:
                System.out.println("incorrect month number");

        }
    }
}
