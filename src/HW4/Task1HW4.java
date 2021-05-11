/*package HW4;

import java.util.Scanner;

public class Task1HW42 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input maxDenominator: ");
        int maxDenominator = scanner.nextInt();
        double sum = 0;
        for (int i = 0; i < maxDenominator; i++) {
            sum += 1.0 / factorial(i);
        }

        System.out.println("e=" + sum);

    }

        private static int factorial ( int n){
            int fact = 1;
            for (int j = 1; j <= n; j++) {
                fact *= j;
            }
            return fact;
        }
    }
*/