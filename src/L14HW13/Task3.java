package L14HW13;

import java.util.ArrayList;
import java.util.Collections;

public class Task3 {
    //3. Write a method switchPairs that switches the order of values in an ArrayList of Strings in a pairwise fashion.
    // Your method should switch the order of the first two values, then switch the order of the next two,
    // switch the order of the next two, and so on.
    public static void main(String[] args) {
        ArrayList listExample = new ArrayList();
        listExample.add("1");
        listExample.add("2");
        listExample.add("3");
        listExample.add("4");
        listExample.add("5");
        listExample.add("6");
        //listExample.add("hamlet");
        System.out.println(listExample);
        swap(listExample);
    }

    private static void swap(ArrayList listExample) {
        int size = listExample.size();
        //if (size % 2 == 0) {
        for (int i = 0; i < size-1; i+=2) {
           // for (int j = 1; j < size; j++) {
                Collections.swap(listExample, i, i+1);
           // }
        }
                System.out.print(listExample);


    }
}



