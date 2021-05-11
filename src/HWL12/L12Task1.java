package HWL12;

import java.util.Locale;

public class L12Task1 {
    //1. Write program which stores weekdays in enum and print out every day of week in new line in view:
    //M o N d A y
    //T u E s D a Y
    //and so on
    public static void main(String[] args) {
        for (Days day : Days.values()) {
            System.out.println(day.toString());
        }

    }


















    private static String formatString(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            String tmp = s.substring(i, i+1);

            if (i % 2 == 1) {
                result.append(tmp.toLowerCase()).append(" ");
            } else {
                result.append(tmp.toUpperCase()).append(" ");
            }
        }

        return result.toString();
    }
}
