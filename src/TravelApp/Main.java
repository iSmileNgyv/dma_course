package TravelApp;

public class Main {
    public static void main(String[] args) {
        var tour = new Tour();
        tour.setTourId(1);
        tour.setTourName("Bali");
        tour.setPrice(1000);
        tour.setReserved(false);
        tour.setTourPackage(TourPackage.BEACH_HOLIDAY);
        var operation = new Operation();
        operation.addTour(tour);
        operation.reserveTour(tour);
        operation.displayInfo();
    }
}
