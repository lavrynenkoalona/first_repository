package L15HW14;

public class Task1 {
    //Write program which contains class with 3 generics,
    // each is used as type of variable inside of class.
    // Add usage of class with generics, use different types of variables for generic
    public static void main(String[] args) {
        Generics<String, Integer, Double> example = new Generics<String, Integer, Double>("cat", 1, 1.3);
        example.printTyypes();
    }

}
