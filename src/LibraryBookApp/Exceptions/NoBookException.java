package LibraryBookApp.Exceptions;

public class NoBookException extends RuntimeException {
    public NoBookException(String message) {
        super(message);
    }
}
