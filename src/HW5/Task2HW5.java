package HW5;

public class Task2HW5 {
    //static int count = 0;
    //static int sum1 = 0;
    //static int sum2 = 1;


    // Print out first 20 Fibonachi numbers using recursion

    public static void main(String[] args) {
//        for (int i = 0; i < 25; i++) {
//            System.out.println(fibonacci(i));
//        }
        System.out.println(s(3, 5));
    }

    private static int fibonacci(int i) {
        if (i == 0)
        {
            return 0;
        }

        if (i == 1 || i == 2)
        {
            return 1;
        }

        return fibonacci(i - 1) + fibonacci(i - 2);
    }

    private static int s(int i, int k)
    {
        if (i == 1)
        {
            return k;
        }
        return k * s(i - 1, k);
    }

   /* static void p() {

        count++;
        if (count <= 20) {
            int nextNum = sum1 + sum2;
            sum1 = sum2;
            sum2 = nextNum;
            p();
            System.out.print(sum1 + " ");
        }
    }*/


}




