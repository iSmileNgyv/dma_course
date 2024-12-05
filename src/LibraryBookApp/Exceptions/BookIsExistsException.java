package LibraryBookApp.Exceptions;

public class BookIsExistsException extends RuntimeException {
    public BookIsExistsException(String message) {
        super(message);
    }
}
