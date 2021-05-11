package HW3;

import java.util.Scanner;

public class Task6HW3 {
    // 3. Take three numbers from the user and print the greatest number

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a:");
        double a = input.nextDouble();
        System.out.println("Input b:");
        double b = input.nextDouble();
        System.out.println("Input c:");
        double c = input.nextDouble();

        if ((a == b) && (b == c) && (a == c)){
            System.out.println("a, b, c are equal and maximum");
        }
        if ((a == b) && (a>c)){
            System.out.println("a, b are equal and maximum");
        }
        if ((a == c) && (a>b)){
            System.out.println("a, c are equal and maximum");
        }
        if ((b == c) && (b>a)){
            System.out.println("b, c are equal and maximum");
        }

        if ( (a > b) && (a > c) ){
            System.out.println("a is the biggest number");
        }
        if ( (b > a) && (b > c) ) {
            System.out.println("b is the biggest number");
        }
        if ( (c > a) && (c > b) ){
            System.out.println("c is the biggest number");
        }
    }
}