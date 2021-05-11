package L13HW12;

public class AccessException extends Exception {
    String message;
    public AccessException(String message) {
        this.message = message;
    }
}
