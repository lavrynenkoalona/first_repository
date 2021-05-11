package L13HW12;

public class Task5 {
    //5. Create program which will result StackOverflowException

    public static void main(String[] args) {
        try {
            testMethod(1);
        } catch (StackOverflowError e) {
            e.printStackTrace();
        }
    }

    private static void testMethod(int i) {
        testMethod(i);
        System.out.println(i);
    }
}
