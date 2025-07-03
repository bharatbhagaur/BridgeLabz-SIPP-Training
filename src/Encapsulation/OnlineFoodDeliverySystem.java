package Encapsulation;

abstract class FoodItem {
    private String itemName;
    private double price;
    private int quantity;

    public FoodItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    protected void setPrice(double price) {
        this.price = price;
    }

    protected void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public abstract double calculateTotalPrice();

    public String getItemDetails() {
        return "Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity;
    }
}

interface Discountable {
    void applyDiscount(double percentage);
    String getDiscountDetails();
}

class VegItem extends FoodItem implements Discountable {
    private double discountApplied;

    public VegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discountApplied = 0;
    }

    public double calculateTotalPrice() {
        return getPrice() * getQuantity();
    }

    public void applyDiscount(double percentage) {
        double discount = (getPrice() * percentage) / 100;
        setPrice(getPrice() - discount);
        discountApplied = discount;
    }

    public String getDiscountDetails() {
        return "Discount on Veg Item: " + discountApplied;
    }
}

class NonVegItem extends FoodItem implements Discountable {
    private double additionalCharge = 20;
    private double discountApplied;

    public NonVegItem(String itemName, double price, int quantity) {
        super(itemName, price, quantity);
        this.discountApplied = 0;
    }

    public double calculateTotalPrice() {
        return (getPrice() + additionalCharge) * getQuantity();
    }

    public void applyDiscount(double percentage) {
        double discount = (getPrice() * percentage) / 100;
        setPrice(getPrice() - discount);
        discountApplied = discount;
    }

    public String getDiscountDetails() {
        return "Discount on Non-Veg Item: " + discountApplied;
    }
}

public class OnlineFoodDeliverySystem {
    public static void processOrder(FoodItem[] items) {
        for (FoodItem item : items) {
            System.out.println(item.getItemDetails());
            if (item instanceof Discountable) {
                ((Discountable) item).applyDiscount(10);
                System.out.println(((Discountable) item).getDiscountDetails());
            }
            System.out.println("Total Price After Discount: " + item.calculateTotalPrice());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        FoodItem[] order = new FoodItem[2];
        order[0] = new VegItem("Paneer Butter Masala", 250, 2);
        order[1] = new NonVegItem("Chicken Biryani", 300, 1);

        processOrder(order);
    }
}
