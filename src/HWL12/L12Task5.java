package HWL12;

public class L12Task5 {
    //Write class which contains just 1 method which returns the result of multiplication of all doubles which it receives.
    // It can receive any amount of double numbers.
    //Add usage of it in main in other class

    public static class Program{

        public static void main (String args[]){

            sum(1.3, 2.6, 3.0);
            sum(1.0, 2.5, 3.1, 4.9, 5.8);
            sum();
        }
        static void sum(double ...nums){

            double result =0;
            for(double n: nums)
                result += n;
            System.out.println(result);
        }
    }
}
