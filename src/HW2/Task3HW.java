package HW2;

import java.util.Scanner;

public class Task3HW {
    //3. Write a program which converts number from hex to decimal view (input in command line)
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a hex number: ");
        String a = input.next();
        int result = decValue(a);
        System.out.println("Decimal to complex: " + result);
    }

    public static int decValue(String hexValue){
       return Integer.parseInt(hexValue, 16);
    }
    }

