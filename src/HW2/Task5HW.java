package HW2;

import java.util.Scanner;
import java.lang.Math;

public class Task5HW {
    //5. Write a program which count x1, x2 for quadratic equation. Input a, b, c from console.
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a:");
        double a = input.nextDouble();
        System.out.println("Input b:");
        double b = input.nextDouble();
        System.out.println("Input c:");
        double c = input.nextDouble();
        double D = desk(a, b, c);
        double x1 = (-b + D) / (2 * a);
        double x2 = (-b - D) / (2 * a);
        System.out.println("x1= " + x1);
        System.out.println("x2= " + x1);
    }
        public static double desk(double y1, double y2, double y3) {
            return Math.sqrt(y2*y2- 4*y1*y3);
        }

    }


