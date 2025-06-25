package constructorinstanceandclassvariable;

public class HotelBooking {
    private String guestName;
    private String roomType;
    private int nights;

    public HotelBooking() {
        this.guestName = "Guest";
        this.roomType = "Deluxe";
        this.nights = 3;
    }

    public HotelBooking(int ignored) {
        this();
    }

    public HotelBooking(HotelBooking other) {
        this.guestName = other.guestName;
        this.roomType = other.roomType;
        this.nights = other.nights;
    }

    public void display() {
        System.out.println("Guest: " + guestName + ", Room: " + roomType + ", Nights: " + nights);
    }

    public static void main(String[] args) {
        HotelBooking booking1 = new HotelBooking();
        HotelBooking booking2 = new HotelBooking(1);
        HotelBooking booking3 = new HotelBooking(booking1);

        booking1.display();
        booking2.display();
        booking3.display();
    }
}
