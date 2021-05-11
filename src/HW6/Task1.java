package HW6;

import java.util.Scanner;

public class Task1 {
    //1. Write program which print out how much times each character is in initial string

    public static void main(String[] args) {

        String str1 = "ExampLe";
        int[] mask = new int[256];
        for (int i = 0; i < str1.length(); i++){
            mask[str1.charAt(i)]++;
        }
        for (int i = 0; i < str1.length(); i++){
            if (mask[str1.charAt(i)] != 0){
                System.out.println(str1.charAt(i) + ":\t" + mask[str1.charAt(i)]);
            }
        }
    }

}

