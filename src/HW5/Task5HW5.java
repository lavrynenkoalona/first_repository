package HW5;

import java.util.Random;

public class Task5HW5 {
    //Write program which create an array from 20 integers with random
    // values, write method with sort them in increase order,
    // use Insertion sort type
    //
    //Similar to the selection sort, but extract
    // the leftmost element from the right-unsorted-sublist,
    // and insert into the correct location of the left-sorted-sublist.
    public static void main(String[] args) {
        int[] arr = new int[20];
        System.out.println("Before shuffle");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100);
            System.out.print(arr[i] + "  ");
        }
        sort(arr);
        System.out.println("\nAfter shuffle");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }

    }

    private static void sort(int[] arr) {
        for (int i = 0; i< arr.length; i++) {
            int a = arr[i];
            int k = i - 1;
            for (; k >= 0; k--) {
                if (a< arr[k]) {
                    arr[k + 1] = arr[k];
                } else {
                    break;
                }
            }
            arr[k + 1] = a;
        }
    }
}
