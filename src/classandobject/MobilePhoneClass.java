package classandobject;

class MobilePhone {
    String brand;
    String model;
    double price;

    void setDetails(String brand, String model, double price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    void displayDetails() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
    }
}

public class MobilePhoneClass {
    public static void main(String[] args) {
        MobilePhone phone1 = new MobilePhone();
        MobilePhone phone2 = new MobilePhone();

        phone1.setDetails("Samsung", "Galaxy S21", 54999.00);
        phone2.setDetails("Apple", "iPhone 14", 78999.00);

        System.out.println("--- Mobile Phone 1 Details ---");
        phone1.displayDetails();

        System.out.println("\n--- Mobile Phone 2 Details ---");
        phone2.displayDetails();
    }
}
