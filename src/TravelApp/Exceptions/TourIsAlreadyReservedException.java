package TravelApp.Exceptions;

public class TourIsAlreadyReservedException extends RuntimeException {
    public TourIsAlreadyReservedException(String message) {
        super(message);
    }
}
