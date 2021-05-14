package L20HW19;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> prices = Arrays.asList(10, 50, 80, 100, 200, 500, 1200, 1500, 2000, 5000);
//   1) By using stream print all the prices ordered from small to big
        prices.stream().sorted().forEach(System.out::println);
        System.out.println("===============");
//   2) By using stream print only the first 5 prices
        prices.stream().limit(5).forEach(System.out::println);
        System.out.println("===============");
//   3) By using stream create new list which holds same prices with tax (add 17% to each one) and print it
        prices.stream().map(i -> i+(i*0.17)).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("===============");
//   4) By using stream print each price after 50% discount, exclude print operation for the first four prices
        prices.stream().map(i -> (i*0.5)).skip(4).collect(Collectors.toList()).forEach(System.out::println);
        System.out.println("===============");
//   5) By using stream print only the prices which are smaller than 500 as string with string format "[price] < 500"
        prices.stream().filter(p->p<500).forEach(i -> System.out.println("[" + i + "] < 500" ));
        System.out.println("===============");
//   6) By using stream multiply each element which is smaller than 500 by 10 and print the results with no duplicated
        prices.stream().filter(p->p<500).map(i -> (i*10)).distinct().forEach(System.out::println);
        System.out.println("===============");
      //7) не поняно задание
    }

}
