package HotelApp;

public class Room {
    private int roomId;
    private RoomType roomType;
    private double price;
    private boolean isReserved;
    private Customer customer = null;

    public Room() {}
    public Room(int roomId, RoomType roomType, double price, boolean isReserved) {
        this.roomId = roomId;
        this.roomType = roomType;
        this.price = price;
        this.isReserved = isReserved;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(int roomId) {
        this.roomId = roomId;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId=" + roomId +
                ", roomType='" + roomType + '\'' +
                ", price=" + price +
                ", isReserved=" + isReserved +
                ", customer=" + customer +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Room room = (Room) obj;
        return roomId == room.roomId;
    }
}
