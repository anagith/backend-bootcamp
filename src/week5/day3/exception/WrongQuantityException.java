package week5.day3.exception;

public class WrongQuantityException extends Exception {
    private String message;

    public WrongQuantityException(String wrong_quantity) {
        message = wrong_quantity;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
