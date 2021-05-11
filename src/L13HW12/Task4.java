package L13HW12;

public class Task4 {
    //4. Write program which has try-catch block inside of catch in try-catch block
    // (with different exception other then we had in class)
    public static void main(String[] args) {
        int arrSize = -8;
        try {
            int[] myArray = new int[arrSize];
        } catch (NegativeArraySizeException e){
            System.out.println("Exception thrown: " + e.getMessage());
            try {
                Number[] a = new Double[2];
                a[0] = new Integer(4);
            } catch (ArrayStoreException e1){
                System.out.println("Exception thrown: " + e1.getMessage());
            }
            System.out.println("After");
        }
        System.out.println("Final line in main");
    }
}
