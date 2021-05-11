package HW6;

public class Task3 {
    //Write a Java program to reverse a string using recursion
    //
    //The given string is: The quick brown fox jumps
    //
    //The string in reverse order is: spmuj xof nworb kciuq ehT

    public static void main(String[] args) {
        String str1 = "example1";
        //StringBuilder sb = new StringBuilder(str1);
        //sb.reverse();
        //System.out.println(sb);

        System.out.println(reverseString(str1));

    }
    public static String reverseString(String s) {
        if (s.length() == 0) {
            return s;
        }
        else {
            return s.charAt(s.length() - 1) + reverseString(s.substring(0, s.length() - 1));
        }
    }
}
