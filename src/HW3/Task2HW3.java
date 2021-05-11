package HW3;

import java.util.Scanner;

public class Task2HW3 {
    //Write a program which take char from console and print out
    // whether it contains number or uppercase symbol or lowercase symbol or special character (!"#$%&'()*+,-./:;<=>?@[\]^_`{|}~)
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("input char value:");
        char a = input.nextLine().charAt(0);

        if (isDigit(a)) {
            System.out.println("'a' is digit");
        } else if (isLowercaseSymbol(a)) {
            System.out.println("'a' is lowercase symbol");
        } else if (isUpercaseSymbol(a)){
            System.out.println("'a' is upercase symbol");
        } else if (isSpecialCharacter(a)) {
            System.out.println("'a' is special symbol");
        } else {
            System.out.println("incorrect value of 'a'");
        }

    }

    private static boolean isSpecialCharacter(char a) {
        boolean result;
        if ((a >= 33 && a <= 47)||(a >= 58 && a <= 64)||(a >= 91 && a <= 96)||(a >= 123 && a <= 126))
        {result = true;}
        else {result = false;}
        return result;
    }
    private static boolean isUpercaseSymbol(char a) {
        return a >= 65 && a <= 90;
    }

    private static boolean isLowercaseSymbol(char a) {
        return a >= 97 && a <= 122;
    }

    private static boolean isDigit(char a) {
        return a >= 48 && a <= 57;
    }
}
