package TravelApp;

import java.util.*;

public class Customer {
    private int customerId;
    private List<Tour> tours = new ArrayList<>();

    public Customer() {}
    public Customer(int id) {
        this.customerId = id;
    }
    public Customer(int id, List<Tour> tours) {
        this.customerId = id;
        this.tours = tours;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public List<Tour> getTours() {
        return tours;
    }

    public void setTours(List<Tour> tours) {
        this.tours = tours;
    }

    @Override
    public String toString() {
        String res = "Customer{id=%d, tours=[\n";
        for(Tour tour : this.tours) {
            if(tour == this.tours.get(this.tours.size() - 1))
                res += tour.toString();
            else
                res += tour.toString() + ", ";
        }
        res += "]}";
        return String.format(res, this.customerId);
    }
}
