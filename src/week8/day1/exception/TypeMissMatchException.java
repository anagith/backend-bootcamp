package week8.day1.exception;

public class TypeMissMatchException extends Exception{

    private String message;

    public TypeMissMatchException(String wrong_product_type) {
        message = wrong_product_type;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
