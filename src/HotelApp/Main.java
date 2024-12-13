package HotelApp;

public class Main {
    public static void main(String[] args) {
        String errMessage = "";
        var hotel = new Hotel();
        try {
            var room = new Room(1, RoomType.ECONOMY, 100, false);
            var room2 = new Room(2, RoomType.BUSINESS, 300, false);

            var customer = new Customer(1, "Ismayil");
            var customer2 = new Customer(2, "Elchin");

            hotel.addRoom(room);
            hotel.addRoom(room2);
            hotel.addCustomer(customer);
            hotel.addCustomer(customer2);

            hotel.reserveRoom(room, customer.getId());

            customer.showRooms();
            hotel.returnRoom(room);
        }catch(Exception ex) {
            errMessage = ex.getMessage();
        } finally {
            hotel.displayInfo();
            System.err.println(errMessage);
        }



    }
}
