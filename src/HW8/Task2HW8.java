package HW8;

public class Task2HW8 {
    //Write program that prompts user for the size (a non-negative integer in int) and prints pattern as shown:
    public static void main(String[] args) {
        int size = 5;
        picture1(size);
        System.out.println("===================================");
        picture2(size);
        System.out.println("===================================");
        picture3(size);
        System.out.println("===================================");
        picture4(size);


    }

    private static void picture3(int size) {
        if (size % 2 == 0 && size < 3) {
            System.out.println("We can't print pattern with such value");
        } else {
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size - i; j++) {
                    System.out.print("  ");
                }
                for (int p = 0; p < (i + 1); p++) {
                    System.out.print((i - p + 1) + " ");
                }
                System.out.println();
            }
        }

    }

    private static void picture4(int size) {
        for (int i = 1; i <= size; i++) {
            for (int j = i; j <= size; j++) {
                System.out.print(((size - j) + 1) + " ");
            }
            System.out.println(" ");
        }

        System.out.println();
    }

    private static void picture1(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j + 1 + " ");
            }
            System.out.println();
        }
    }


    private static void picture2(int r) {
        for (int i = 0; i <= r; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= r; j++) {
                System.out.print((r - i) + 1);
            }

            System.out.println();

        }
    }

}