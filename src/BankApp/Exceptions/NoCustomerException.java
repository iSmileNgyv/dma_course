package BankApp.Exceptions;

public class NoCustomerException extends RuntimeException{
    public NoCustomerException(String message) {
        super(message);
    }
}
