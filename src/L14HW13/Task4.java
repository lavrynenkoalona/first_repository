package L14HW13;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Task4 {
    //4. Write a program which measure time of inserting of new entry to hashmap and treemap,
    // use different amounts of new entries (100, 1000, 10000, 1000000…)
    public static void main(String[] args) {


        System.out.println(getInsertTimeToMap(new HashMap<>(), 100000));
        System.out.println(getInsertTimeToMap(new TreeMap<>(), 100000));
    }


    public static long getInsertTimeToMap(Map<Integer, Integer> testedMap, int countRec)
    {
        long start = System.currentTimeMillis();
        for (int i = 0; i < countRec; i++)
        {
            testedMap.put(i, i);
        }
        return System.currentTimeMillis() - start;
    }

}
