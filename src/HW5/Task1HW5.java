package HW5;

public class Task1HW5 {
    //Write program with example of overloading with methods
    // with variations of parameters: (int), (int, int), (double, int),
    // (int, double), (int, float, String)
    // and without parameters.
    // Add case of usage types substitution from
    // Type Promotion table (int → long → float → double)
    public static void main(String[] args) {
        String t = "Hello";

        System.out.println(example1(2));
        System.out.println(example1(2, 3));
        System.out.println(example1(2.2, 3));
        System.out.println(example1(4, 3.2));
        System.out.println(example1(4, 5.0f, t));
        System.out.println(example1());
        System.out.println(example1(2, 2, 2));
    }

    static int example1(int x) {
        return x;
    }

    static int example1(int x, int y) {
        return x + y;
    }

    static double example1(double x, int y) {
        return x + y;
    }

    static double example1(int x, double y) {
        return x + y;
    }

    static String example1() {
        return "Hi!";
    }

    static String example1(int x, float y, String t) {
        return t;
    }

    static long example1(long x, long y, long z) {
        return x + y + z;
    }
}

