package L13HW12;

//        Write program which have variable which is null.
public class Task1 {


    public static void main(String[] args) {
        try {
            String str = null;
            System.out.println(str.toString());
        } catch (NullPointerException e) {
            System.out.println("Exception thrown  :" + e);
        }
    }
}
