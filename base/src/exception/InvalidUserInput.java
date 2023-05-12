package exception;

public class InvalidUserInput extends Exception {
    public InvalidUserInput() {
    }

    public InvalidUserInput(String message) {
        super(message);
    }
}
