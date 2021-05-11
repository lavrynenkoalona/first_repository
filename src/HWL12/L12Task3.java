package HWL12;

public class L12Task3 {
    // Write program which contains enum with 3 values (name of value and int number).
// Print out in main in other class all pairs which you store in enum
    public static void main(String[] args) {
        for (Ages age: Ages.values()) {
            System.out.println(age.name() + ": " + age.getValue());
        }
    }
}
