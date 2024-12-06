package StudentMapApp.Exceptions;

public class StudentExistException extends RuntimeException {
    public StudentExistException(String message) {
        super(message);
    }
}
