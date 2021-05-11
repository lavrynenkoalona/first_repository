package HW5;

import java.util.Random;

public class Task3HW5 {
    //Write program which create an array from 20 integers with random values
// write method with shuffle elements of array in random order
    public static void main(String[] args) {
        int[] arr = new int[20];
        System.out.println("Before shuffle");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        shuffle(arr);
        System.out.println("\nAfter shuffle");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
             }

    }

    private static void shuffle(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Random rnd = new Random();
            int index = rnd.nextInt(i + 1);
            int b = arr[index];
            arr[index] = arr[i];
            arr[i] = b;
        }
    }
}







