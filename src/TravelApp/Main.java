package TravelApp;

public class Main {
    public static void main(String[] args) {
        var customer = new Customer(1);
        var tour = new Tour();
        tour.setTourId(1);
        tour.setTourName("Bali");
        tour.setPrice(1000);
        tour.setReserved(false);
        tour.setTourPackage(TourPackage.BEACH_HOLIDAY);
        tour.setCustomer(customer);
        var operation = new Operation();
        operation.addTour(tour);
        operation.reserveTour(tour);
        operation.displayInfo();
    }
}
