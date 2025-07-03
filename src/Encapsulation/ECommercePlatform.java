package Encapsulation;

abstract class Product {
    private int productId;
    private String name;
    private double price;

    public Product(int productId, String name, double price) {
        this.productId = productId;
        this.name = name;
        this.price = price;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public abstract double calculateDiscount();
}

interface Taxable {
    double calculateTax();
    String getTaxDetails();
}

class Electronics extends Product implements Taxable {
    private double warrantyCost;

    public Electronics(int productId, String name, double price, double warrantyCost) {
        super(productId, name, price);
        this.warrantyCost = warrantyCost;
    }

    public double getWarrantyCost() {
        return warrantyCost;
    }

    public void setWarrantyCost(double warrantyCost) {
        this.warrantyCost = warrantyCost;
    }

    public double calculateDiscount() {
        return getPrice() * 0.10;
    }

    public double calculateTax() {
        return getPrice() * 0.18;
    }

    public String getTaxDetails() {
        return "Electronics Tax: 18%";
    }
}

class Clothing extends Product implements Taxable {
    private String size;

    public Clothing(int productId, String name, double price, String size) {
        super(productId, name, price);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public double calculateDiscount() {
        return getPrice() * 0.20;
    }

    public double calculateTax() {
        return getPrice() * 0.05;
    }

    public String getTaxDetails() {
        return "Clothing Tax: 5%";
    }
}

class Groceries extends Product {
    private String expiryDate;

    public Groceries(int productId, String name, double price, String expiryDate) {
        super(productId, name, price);
        this.expiryDate = expiryDate;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public double calculateDiscount() {
        return getPrice() * 0.05;
    }
}

public class ECommercePlatform {
    public static void printFinalPrices(Product[] products) {
        for (Product product : products) {
            double tax = 0;
            if (product instanceof Taxable) {
                tax = ((Taxable) product).calculateTax();
            }
            double discount = product.calculateDiscount();
            double finalPrice = product.getPrice() + tax - discount;
            System.out.println("Product: " + product.getName() + ", Final Price: " + finalPrice);
            if (product instanceof Taxable) {
                System.out.println(((Taxable) product).getTaxDetails());
            }
        }
    }

    public static void main(String[] args) {
        Product[] products = new Product[3];

        products[0] = new Electronics(201, "Laptop", 80000, 2000);
        products[1] = new Clothing(202, "T-Shirt", 2000, "M");
        products[2] = new Groceries(203, "Rice Bag", 1000, "2025-12-31");

        printFinalPrices(products);
    }
}

