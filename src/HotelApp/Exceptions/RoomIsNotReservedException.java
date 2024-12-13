package HotelApp.Exceptions;

public class RoomIsNotReservedException extends RuntimeException {
    public RoomIsNotReservedException(String message) {
        super(message);
    }
}
