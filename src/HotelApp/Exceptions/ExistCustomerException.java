package HotelApp.Exceptions;

public class ExistCustomerException extends RuntimeException {
    public ExistCustomerException(String message) {
        super(message);
    }
}
