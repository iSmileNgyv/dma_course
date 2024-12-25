package GenericQueue.Exceptions;

public class QueueNotFoundError extends RuntimeException {
    public QueueNotFoundError(String message) {
        super(message);
    }
}
