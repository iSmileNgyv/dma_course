package TravelApp;

public class Tour {
    private int tourId;
    private String tourName;
    private double price;
    private boolean isReserved;
    private TourPackage tourPackage;

    public Tour() {}
    public Tour(int tourId, String tourName, double price, boolean isReserved, TourPackage tourPackage) {
        this.tourId = tourId;
        this.tourName = tourName;
        this.price = price;
        this.isReserved = isReserved;
        this.tourPackage = tourPackage;
    }

    public int getTourId() {
        return tourId;
    }

    public void setTourId(int tourId) {
        this.tourId = tourId;
    }

    public String getTourName() {
        return tourName;
    }

    public void setTourName(String tourName) {
        this.tourName = tourName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isReserved() {
        return isReserved;
    }

    public void setReserved(boolean reserved) {
        isReserved = reserved;
    }

    public TourPackage getTourPackage() {
        return tourPackage;
    }

    public void setTourPackage(TourPackage tourPackage) {
        this.tourPackage = tourPackage;
    }

    @Override
    public String toString() {
        return String.format("Tour ID: %d\nTour Name: %s\nPrice: %.2f\nIs Reserved: %b\nTour Package: %s\n",
                this.getTourId(), this.getTourName(), this.getPrice(), this.isReserved(), this.getTourPackage());
    }
}
