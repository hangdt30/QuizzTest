package month;

public class CustomException extends Exception {

    public CustomException(String message) {
        super(message);
    }

    public CustomException() {
        super("Default exception message");
    }

}