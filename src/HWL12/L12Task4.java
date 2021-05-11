package HWL12;

import java.util.Random;

public class L12Task4 {
    //4. Write program which find all pairs on integer array whose sum is equal to given number
    public static void main(String[] args) {
        int[] arr = {2, 13, 4, 6, 5, 7, 10, 1, 8};
        int a = 9;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                int value1 = arr[i];
                int value2 = arr[j];
                if ((value1 + value2) == a) {
                    System.out.println(value1 + "," + value2);
                }
            }
        }
    }

}
