package HotelApp;

import HotelApp.Exceptions.*;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {
    private final ArrayList<Customer> customers = new ArrayList<>();
    private final ArrayList<Room> rooms = new ArrayList<>();
    private final ArrayList<String> logs = new ArrayList<>();

    public void addCustomer(Customer customer) {
        this.existCustomer(customer);
        customers.add(customer);
    }

    public void addRoom(Room room) {
        this.existRoom(room);
        rooms.add(room);
    }

    public void returnRoom(Room room) {
        if(!room.isReserved()) {
            throw new RoomIsNotReservedException(String.format("Room with id %d is not reserved", room.getRoomId()));
        }
        room.setReserved(false);
        Customer c = room.getCustomer();
        room.setCustomer(null);
        c.removeRoom(room);
        this.addLog(String.format("Room with id %d is returned by %s", room.getRoomId(), c.getName()));
    }

    public void reserveRoom(Room room, int customerId) {
        if(room.isReserved()) {
            throw new RoomAlreadyReservedException(String.format("Room with id %d is already reserved", room.getRoomId()));
        }
        Customer c = this.findCustomer(customerId);
        room.setReserved(true);
        room.setCustomer(c);
        c.addRoom(room);
        this.addLog(String.format("Room with id %d is reserved by %s", room.getRoomId(), c.getName()));
    }

    public void displayInfo() {
        for(String log : this.logs) {
            System.out.println(log);
        }
    }

    private void addLog(String log) {
        this.logs.add(log);
    }

    private Customer findCustomer(int customerId) {
        for(Customer c : this.customers) {
            if(c.getId() == customerId) {
                return c;
            }
        }
        throw new CustomerNotFoundException(String.format("Customer with id %d not found", customerId));
    }
    private void existCustomer(Customer customer) {
        for(Customer c : this.customers) {
            if(c.equals(customer)) {
                throw new ExistCustomerException(String.format("Customer with id %d already exists", customer.getId()));
            }
        }
    }

    private void existRoom(Room room) {
        for(Room r : this.rooms) {
            if(r.equals(room)) {
                throw new ExistRoomException(String.format("Room with id %d already exists", room.getRoomId()));
            }
        }
    }
}
