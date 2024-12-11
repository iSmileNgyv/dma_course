package TravelApp.Exceptions;

public class TourIsNotReservedException extends RuntimeException {
    public TourIsNotReservedException(String message) {
        super(message);
    }
}
