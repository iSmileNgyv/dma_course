package LibraryBookApp.Exceptions;

public class AlreadyRentedException extends RuntimeException {
    public AlreadyRentedException(String message) {
        super(message);
    }
}
