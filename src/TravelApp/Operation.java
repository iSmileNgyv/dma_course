package TravelApp;

import TravelApp.Exceptions.TourIsAlreadyReservedException;
import TravelApp.Exceptions.TourIsNotReservedException;
import TravelApp.Exceptions.TourNotFoundException;

import java.util.ArrayList;

public class Operation {
    private final ArrayList<Tour> tours = new ArrayList<>();

    public Operation() {}

    public void addTour(Tour tour) {
        tours.add(tour);
    }

    public void removeTour(Tour tour) {
        this.isExistTour(tour);
        tours.remove(tour);
    }

    private void isExistTour(Tour tour) {
        if(!tours.contains(tour))
            throw new TourNotFoundException("Tour not found");
    }

    public void reserveTour(Tour tour) {
        this.isExistTour(tour);
        if(tour.isReserved())
            throw new TourIsAlreadyReservedException("Tour is already reserved");
        if(tour.getCustomer() == null)
            throw new NullPointerException("Customer is not set");
        tour.getCustomer().getTours().add(tour);
        tour.setReserved(true);
    }

    public void cancelReserve(Tour tour) {
        this.isExistTour(tour);
        if(!tour.isReserved())
            throw new TourIsNotReservedException("Tour is not reserved");
        if(tour.getCustomer() == null)
            throw new NullPointerException("Customer is not set");
        tour.getCustomer().getTours().remove(tour);
        tour.setCustomer(new Customer(0));
        tour.setReserved(false);
    }

    public void displayInfo() {
        for(Tour tour : tours) {
            System.out.println(tour);
        }
    }
}
