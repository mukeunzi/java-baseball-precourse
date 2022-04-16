package baseball.exception;

public class InvalidParameterError extends IllegalArgumentException {
    public InvalidParameterError(String message) {
        super(message);
    }
}
