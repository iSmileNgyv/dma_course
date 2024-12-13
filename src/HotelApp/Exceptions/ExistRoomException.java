package HotelApp.Exceptions;

public class ExistRoomException extends RuntimeException {
    public ExistRoomException(String message) {
        super(message);
    }
}
