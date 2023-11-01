package Java_Practice.Oct24.ExceptionDemo;

public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }

}
