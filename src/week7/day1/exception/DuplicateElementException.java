package week7.day1.exception;

public class DuplicateElementException extends RuntimeException {
    private String message;

    public DuplicateElementException(String already_exists) {
        message = already_exists;
    }

    public String getMessage() {
        return message;
    }
}
