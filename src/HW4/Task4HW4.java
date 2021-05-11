package HW4;

public class Task4HW4 {
    //Write a program to extract each digit from a double, in the reverse order.
    //
    //For example, if the double is 2522.43034, the output shall be " 4 3 0 3 4 . 2 2 5 2", with a space separating the digits.
    public static void main(String[] args) {


        double i = 2522.43034;
        i = i * 100000;
                while (i > 0) {
            int digit = (int)i % 10;
            System.out.print(digit);
            i = (int)i / 10;
        }
    }
}
