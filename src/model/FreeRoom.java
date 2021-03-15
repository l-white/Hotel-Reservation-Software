package model;

public abstract class FreeRoom extends Room {

    private Double price = 0.00;

    public FreeRoom(String roomNumber, Double price, RoomType enumeration) {
        super(roomNumber, price, enumeration);
        this.price = price;
    }

    @Override
    public String toString() {
        return "\nPrice: " + price;
    }

}
