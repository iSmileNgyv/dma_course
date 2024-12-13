package HotelApp;

import HotelApp.Exceptions.WrongOperationException;

import java.util.ArrayList;

public class Customer {
    private int id;
    private String name;
    private ArrayList<Room> rooms = new ArrayList<>();

    public Customer(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void addRoom(Room room) {
        if(this.rooms.contains(room)) {
            throw new WrongOperationException("Room already exists");
        }
        this.rooms.add(room);
    }

    public void removeRoom(Room room) {
        if(!this.rooms.contains(room)) {
            throw new WrongOperationException("Room does not exist");
        }
        this.rooms.remove(room);
    }

    public void showRooms() {
        for(Room room : this.rooms) {
            System.out.println(room);
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Customer customer = (Customer) obj;
        return id == customer.id;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
