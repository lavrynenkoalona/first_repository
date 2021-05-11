package HW8;

import java.util.Scanner;

public class Task3HW8 {
    public static void main(String[] args) {
        //Write a program called printArrayInStars which prompts user for the number of items
        // in an array (a non-negative integer), and saves it in an int variable called numItems.
        //
        //It then prompts user for the values of all the items (non-negative integers)
        // and saves them in an int array called items.
        //
        //The program shall then print the contents of the array in a graphical form,
        // with the array index and values represented by number of stars.
        Scanner input = new Scanner(System.in); // Объявляем Scanner
        System.out.println("Enter arr length: ");
        int size = input.nextInt(); // Читаем с клавиатуры размер массива и записываем в size
        int arr[] = new int[size]; // Создаём массив int размером в size
        System.out.println("Insert arr elements:");
        /*Пройдёмся по всему массиву, заполняя его*/
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print ("Inserted arr elements:");
        for (int i = 0; i < size; i++) {
           System.out.print (" " + arr[i]); // Выводим на экран, полученный массив
        }
        System.out.println();

//        int[] arr = {3, 7, 9, 6, 5};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + ":");
            for (int k = 0; k < arr[i]; k++) {
                System.out.print("*");

            }
            System.out.print("(" + arr[i] + ")");
            System.out.println();
        }
    }
}
