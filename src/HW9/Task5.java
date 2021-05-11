package HW9;

public class Task5 {
    ////Create 2 classes, each contains 2 variables.
    //    // In first class override equals and hashcode.
    //    // Create few instances of both classes and compare them using ‘==’ and equals()
    public static void main(String[] args) {


        Task5first example1 = new  Task5first(5,"First");
        Task5first example2 = new  Task5first(5,"Second");
        Task5second example3 = new  Task5second(15,"Third");
        Task5second example4 = new  Task5second(5,"Second");


        System.out.println(example1.equals(example2));
		System.out.println(example1.equals(example1));
		System.out.println(example1.equals(example3));
        System.out.println(example1.equals(example4));

        System.out.println(example2 == example1);
        System.out.println(example2 == example2);

    }
}
