package HW6;

public class Task2 {
    //2. Write a Java program to print out the maximum
    // occurring character in initial string. If there are few of them -> print them all
    public static void main(String[] args) {

        String str1 = "exampxle";
        int[] mask = calcSymbols(str1);
        int maxValue = getMaxOccrurency(mask);
        printMaxSymbols(mask, maxValue);
    }

    private static void printMaxSymbols(int[] mask, int maxValue) {
        for (int i = 0; i < mask.length; i++) {
            if (mask[i] == maxValue) {
                System.out.println((char)i + ": " + mask[i]);
            }
        }
    }

    private static int[] calcSymbols(String str){
        int[] mask = new int[256];
        for (int i = 0; i < str.length(); i++) {
            mask[str.charAt(i)]++;
        }
        return mask;
    }

    private static int getMaxOccrurency(int[] mask){
        int maxIndex = 0;
        for(int i = 1; i < mask.length; i++){
            int prev = mask[i-1];
            int curr = mask[i];
            if (curr > prev){
                maxIndex = i;
            }
        }
        return mask[maxIndex];
    }


}
