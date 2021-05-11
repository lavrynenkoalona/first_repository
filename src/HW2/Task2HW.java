package HW2;

import java.util.Scanner;

public class Task2HW {
    //2. Write a program which count the volume of cylinder and print result in console. Radius and height user input from console

    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Input double value of h:");
        double h = input.nextDouble();
        System.out.println("Input double value of r:");
        double r = input.nextDouble();
        double radiusV = radius(r);
        double V = (Math.PI * radiusV * h);

        System.out.println("V=" + V);
    }
        static double radius(double R){
        return Math.pow(R,2);
        }
    }


