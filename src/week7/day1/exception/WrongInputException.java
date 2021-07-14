package week7.day1.exception;

public class WrongInputException extends Exception {
    private String message;

    public WrongInputException(String wrong_input) {
        message = wrong_input;
    }

    public String getMessage() {
        return message;
    }
}
