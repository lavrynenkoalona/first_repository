package HW5;

public class Task4HW5 {
    //Write program which create an array from 20 integers
    // with random values, write method with sort them in increase order,
    // use Selection sort type
    //
    //This algorithm divides the lists into two parts:
    // the left-sublist of items already sorted,
    // and the right-sublist for the remaining items.
    // Initially, the left-sorted-sublist is empty,
    // while the right-unsorted-sublist is the entire list.
    // The algorithm proceeds by finding the smallest (or largest) items
    // from the right-unsorted-sublist, swapping it with the leftmost
    // element of the right-unsorted-sublist,
    // and increase the left-sorted-sublist by one.

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
        for (int i = 0; i <  arr.length - 1; i++) {
            int min_idx = i;
            for (int j = i + 1; j <  arr.length; j++) {
                if (arr[j] < arr[min_idx])
                    min_idx = j;
            }
            int temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }


}
