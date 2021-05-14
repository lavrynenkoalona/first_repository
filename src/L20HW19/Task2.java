package L20HW19;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Task2 {
    public static void main(String[] args) {
        List<String> colors = Arrays.asList("blue", "red", "white","black","yellow","gray","green","pink","purple","brown");

        filter(colors, color -> color.contains("b"));
        // 1) Prints only colors which start with the letter “G”
        filter(colors, color -> color.startsWith("g"));
        // 2) Prints only colors with 4 letters
        filter(colors, color-> color.length() == 4);
        // 3) Prints colors which ends with the letter “e”
        filter(colors, color -> color.endsWith("e"));
        //  4) Prints all colors
        filter(colors, color-> true);
        //  5) Prints nothing (no color)
        filter(colors, color-> false);
    }

    public static void filter(List<String> list, Predicate<String> predicate)
    {
        list.stream().filter(predicate).forEach(System.out::println);
    }
}
