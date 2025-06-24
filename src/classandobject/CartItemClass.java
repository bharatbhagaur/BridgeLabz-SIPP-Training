package classandobject;

import java.util.ArrayList;
import java.util.Scanner;

class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    double getTotalPrice() {
        return price * quantity;
    }

    void displayItem() {
        System.out.println(itemName + " - ₹" + price + " x " + quantity + " = ₹" + getTotalPrice());
    }
}

class ShoppingCart {
    ArrayList<CartItem> items = new ArrayList<>();

    void addItem(String itemName, double price, int quantity) {
        items.add(new CartItem(itemName, price, quantity));
        System.out.println(itemName + " added to cart.");
    }

    void removeItem(String itemName) {
        boolean removed = false;
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).itemName.equalsIgnoreCase(itemName)) {
                items.remove(i);
                removed = true;
                System.out.println(itemName + " removed from cart.");
                break;
            }
        }
        if (!removed) {
            System.out.println(itemName + " not found in cart.");
        }
    }

    void displayTotalCost() {
        double total = 0;
        for (CartItem item : items) {
            total += item.getTotalPrice();
        }
        System.out.println("Total Cost: ₹" + total);
    }

    void displayCart() {
        if (items.isEmpty()) {
            System.out.println("Cart is empty.");
        } else {
            System.out.println("----- Cart Items -----");
            for (CartItem item : items) {
                item.displayItem();
            }
            displayTotalCost();
        }
    }
}

public class CartItemClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ShoppingCart cart = new ShoppingCart();
        int choice;

        do {
            System.out.println("\n--- Shopping Cart Menu ---");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. View Cart");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter item name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter price: ");
                    double price = sc.nextDouble();
                    System.out.print("Enter quantity: ");
                    int qty = sc.nextInt();
                    cart.addItem(name, price, qty);
                    break;
                case 2:
                    System.out.print("Enter item name to remove: ");
                    String removeName = sc.nextLine();
                    cart.removeItem(removeName);
                    break;
                case 3:
                    cart.displayCart();
                    break;
                case 4:
                    System.out.println("Thank you for shopping!");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }

        } while (choice != 4);
    }
}

