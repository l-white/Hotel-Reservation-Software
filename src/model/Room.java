package model;

public abstract class Room implements IRoom {

    //private Object RoomType;
    private String roomNumber;
    private Double price;
    private RoomType roomType;

    public Room(String roomNumber, Double price, RoomType roomType) {
        super();
        this.roomNumber = roomNumber;
        this.price = price;
        this.roomType = roomType;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber() {
        this.roomNumber = roomNumber;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice() {
        this.price = price;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType() {
        this.roomType = roomType;
    }



    @Override
    public String toString() {
        return "Room Number: " + roomNumber + "\nPrice: " + price;
    }
}
