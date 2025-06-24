package classandobject;

import java.util.Scanner;

class Item {
    int itemCode;
    String itemName;
    double price;

    void setDetails(int itemCode, String itemName, double price) {
        this.itemCode = itemCode;
        this.itemName = itemName;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Item Code: " + itemCode);
        System.out.println("Item Name: " + itemName);
        System.out.println("Price per Unit: " + price);
    }

    double calculateTotalCost(int quantity) {
        return price * quantity;
    }
}

public class ItemClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Item item = new Item();

        System.out.print("Enter Item Code: ");
        int code = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Item Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Price: ");
        double price = sc.nextDouble();

        System.out.print("Enter Quantity: ");
        int quantity = sc.nextInt();

        item.setDetails(code, name, price);
        System.out.println("\n--- Item Details ---");
        item.displayDetails();

        double totalCost = item.calculateTotalCost(quantity);
        System.out.println("Total Cost for " + quantity + " units: " + totalCost);
    }
}
