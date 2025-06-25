package constructorinstanceandclassvariable;

public class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private static final int COST_PER_DAY = 1500;

    public CarRental() {
        this.customerName = "Amit Sharma";
        this.carModel = "Hyundai i20";
        this.rentalDays = 5;
    }

    public int calculateTotalCost() {
        return rentalDays * COST_PER_DAY;
    }

    public void display() {
        System.out.println("Customer: " + customerName + ", Car: " + carModel + ", Days: " + rentalDays + ", Total Cost: ₹" + calculateTotalCost());
    }

    public static void main(String[] args) {
        CarRental rental = new CarRental();
        rental.display();
    }
}

