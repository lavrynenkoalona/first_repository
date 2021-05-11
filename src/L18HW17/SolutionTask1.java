package L18HW17;

import java.util.ArrayList;
import java.util.List;
//1. Write program which create new objects in a loop and count the amount of iterations
// till “OutOfMemoryError: Java Heap Space error” is thrown by Java.
// Remember amount of iterations. Increase Heap size x2 (x3, x5).
// Run program after increasing of Heap size, compare amount of iteration on different heap size configuration.
// (Hint: it’s better to create new objects which have big size)

public class SolutionTask1 {
    public static void main(String[] args) throws Exception {

        int i = 0;
        try {
            List<Integer> list = new ArrayList<>();
            while (true) {
                int a = (int) (Math.random() * 10000);
                list.add(a);
                i++;
            }
        }catch (OutOfMemoryError e)
        {
           System.out.println("Iteration count: " + i);
        }
    }
}