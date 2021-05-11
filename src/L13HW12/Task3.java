package L13HW12;

public class Task3 {
    //Write our own type of exception (with message) and add usage of it in main method
    public static void main(String[] args) {
        try {
            System.out.println("isAccessOk = " + isAccessOk(17, true, false));
        } catch (AccessException e) {
            e.printStackTrace();
        }
    }

    static boolean isAccessOk(int age, boolean login, boolean password) throws AccessException {
        if ((login) || (password) || (age < 18)) {
            throw new AccessException("Access is not Ok");
        } else {
            return true;
        }
    }
}
