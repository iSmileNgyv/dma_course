package LibraryBookApp.Exceptions;

public class WrongOperationException extends RuntimeException {
    public WrongOperationException(String message) {
        super(message);
    }
}
