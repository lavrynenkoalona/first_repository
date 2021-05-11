package HW6;

public class Task4 {
    //Write a Java program to reverse words in a initial string
    //
    //The given string is: Reverse text in a string
    //
    //The new string after reversed the words: string a in text Reverse
    public static void main(String[] args) {
        String str1= "Fist Second Third Word";
        System.out.println(reverseWords(str1));
    }
    public static String reverseWords(String str) {
        String arr[] = str.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for (int i = arr.length - 1; i >= 0; i--) {
            sb.append(arr[i] + " ");
        }
        return sb.toString().trim();
    }
    }

