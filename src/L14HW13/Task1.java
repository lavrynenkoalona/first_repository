package L14HW13;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;

public class Task1 {
    //1. Create a List (try both ArrayList and LinkedList) and fill it with 5 countries.
    // Sort the list and print it, then apply Collections.shuffle( ) to the list repeatedly,
    // printing it each time so that you can see how the shuffle( ) method randomizes the list differently each time.
    public static void main(String[] args) {
        ArrayList <String>list= new ArrayList<String>();
        System.out.println(list);
        list.add("Ukraine");
        list.add("Turkey");
        list.add("USA");
        list.add("Germany");
        list.add("Italy");
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        System.out.println("============================");


        LinkedList <String> lkList= new LinkedList<String>();
        System.out.println(lkList);
        lkList.add("Ukraine");
        lkList.add("Turkey");
        lkList.add("USA");
        lkList.add("Germany");
        lkList.add("Italy");
        System.out.println(lkList);
        Collections.sort(lkList);
        System.out.println(lkList);
        Collections.shuffle(lkList);
        System.out.println(lkList);
        Collections.shuffle(lkList);
        System.out.println(lkList);
    }
}
