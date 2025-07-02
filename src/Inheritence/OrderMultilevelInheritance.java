package Inheritence;


class Order {
    String orderId;
    String orderDate;

    Order(String orderId, String orderDate) {
        this.orderId = orderId;
        this.orderDate = orderDate;
    }

    String getOrderStatus() {
        return "Order Placed";
    }

    void displayDetails() {
        System.out.println("Order ID: " + orderId);
        System.out.println("Order Date: " + orderDate);
        System.out.println("Status: " + getOrderStatus());
    }
}

class ShippedOrder extends Order {
    String trackingNumber;

    ShippedOrder(String orderId, String orderDate, String trackingNumber) {
        super(orderId, orderDate);
        this.trackingNumber = trackingNumber;
    }

    String getOrderStatus() {
        return "Order Shipped - Tracking #: " + trackingNumber;
    }
}

class DeliveredOrder extends ShippedOrder {
    String deliveryDate;

    DeliveredOrder(String orderId, String orderDate, String trackingNumber, String deliveryDate) {
        super(orderId, orderDate, trackingNumber);
        this.deliveryDate = deliveryDate;
    }

    String getOrderStatus() {
        return "Order Delivered on " + deliveryDate;
    }
}

public class OrderMultilevelInheritance  {
    public static void main(String[] args) {
        Order order = new Order("ORD001", "2025-06-30");
        ShippedOrder shipped = new ShippedOrder("ORD002", "2025-06-28", "TRK123456");
        DeliveredOrder delivered = new DeliveredOrder("ORD003", "2025-06-25", "TRK654321", "2025-06-29");

        order.displayDetails();
        System.out.println();
        shipped.displayDetails();
        System.out.println();
        delivered.displayDetails();
    }
}
