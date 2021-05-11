package HW8;

public class Task4HW8 {
    public static void main(String[] args) {

        //Write a program which print out table of how many times each character is present in initial String (ignore case of charachter)

        String str1 = "HilleL";
        String s = str1.toLowerCase();
        System.out.println(s);
        int[] mask = new int[256];

        for (int i = 0; i < s.length(); i++) {
            mask[s.charAt(i)]++;
        }

        printOccurance(s, mask);
    }

    private static void printOccurance(String str, int[] mask)
    {
        for (int i = 1; i <= str.length(); i++)
        {
            String temp = "";
            for (int j = 0; j < mask.length; j++)
            {
                if (mask[j] == i)
                {
                    temp +="'" + (char)j + "'";
                }
            }
            if (temp.length() > 0)
            {
                System.out.println(i + " occurance: " + temp);
            }
        }
    }
}
