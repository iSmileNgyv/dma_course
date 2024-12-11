package TravelApp;

import TravelApp.Exceptions.TourIsAlreadyReservedException;
import TravelApp.Exceptions.TourIsNotReservedException;
import TravelApp.Exceptions.TourNotFoundException;

import java.util.ArrayList;

public class Operation {
    private final ArrayList<Tour> tours = new ArrayList<>();

    public Operation() {}

    public Operation(ArrayList<Tour> tours) {
        this.tours.addAll(tours);
    }

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
        tour.setReserved(true);
    }

    public void cancelReserve(Tour tour) {
        this.isExistTour(tour);
        if(!tour.isReserved())
            throw new TourIsNotReservedException("Tour is not reserved");
        tour.setReserved(false);
    }

    public void displayInfo() {
        for(Tour tour : tours) {
            System.out.println("Tour ID: " + tour.getTourId());
            System.out.println("Tour Name: " + tour.getTourName());
            System.out.println("Price: " + tour.getPrice());
            System.out.println("Is Reserved: " + tour.isReserved());
            System.out.println("Tour Package: " + tour.getTourPackage());
            System.out.println();
        }
    }
}
