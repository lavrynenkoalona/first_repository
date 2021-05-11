package HW6;

public class Task5 {
    // Write a Java program to read a string and an int from console, return a string without the character with described index
    //
    //The initial strings is: Hello buddy
    //
    //The numbers is: 3
    //
    //The new string is: Helo buddy

    public static void main(String[] args) {
        String str1 = "Hello buddy";
        System.out.println(removeCharAt(str1, 3));}

        public static String removeCharAt(String str, int pos) {
            return str.substring(0, pos) + str.substring(pos + 1);
            // Возвращаем подстроку s, которая начиная с нулевой позиции переданной строки (0) и заканчивается позицией символа (pos), который мы хотим удалить, соединенную с другой подстрокой s, которая начинается со следующей позиции после позиции символа (pos + 1), который мы удаляем, и заканчивается последней позицией переданной строки.
    }
    }

