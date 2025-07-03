package Encapsulation;

abstract class LibraryItem {
    private String itemId;
    private String title;
    private String author;

    public LibraryItem(String itemId, String title, String author) {
        this.itemId = itemId;
        this.title = title;
        this.author = author;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public abstract int getLoanDuration();

    public String getItemDetails() {
        return "ID: " + itemId + ", Title: " + title + ", Author: " + author;
    }
}

interface Reservable {
    boolean reserveItem(String borrowerId);
    boolean checkAvailability();
}

class Book extends LibraryItem implements Reservable {
    private boolean reserved;
    private String borrowerId;

    public Book(String itemId, String title, String author) {
        super(itemId, title, author);
        this.reserved = false;
    }

    public int getLoanDuration() {
        return 21;
    }

    public boolean reserveItem(String borrowerId) {
        if (!reserved) {
            this.borrowerId = borrowerId;
            reserved = true;
            return true;
        }
        return false;
    }

    public boolean checkAvailability() {
        return !reserved;
    }

    private String getBorrowerId() {
        return borrowerId;
    }
}

class Magazine extends LibraryItem implements Reservable {
    private boolean reserved;
    private String borrowerId;

    public Magazine(String itemId, String title, String author) {
        super(itemId, title, author);
        this.reserved = false;
    }

    public int getLoanDuration() {
        return 7;
    }

    public boolean reserveItem(String borrowerId) {
        if (!reserved) {
            this.borrowerId = borrowerId;
            reserved = true;
            return true;
        }
        return false;
    }

    public boolean checkAvailability() {
        return !reserved;
    }

    private String getBorrowerId() {
        return borrowerId;
    }
}

class DVD extends LibraryItem implements Reservable {
    private boolean reserved;
    private String borrowerId;

    public DVD(String itemId, String title, String author) {
        super(itemId, title, author);
        this.reserved = false;
    }

    public int getLoanDuration() {
        return 3;
    }

    public boolean reserveItem(String borrowerId) {
        if (!reserved) {
            this.borrowerId = borrowerId;
            reserved = true;
            return true;
        }
        return false;
    }

    public boolean checkAvailability() {
        return !reserved;
    }

    private String getBorrowerId() {
        return borrowerId;
    }
}

public class LibraryManagementSystem {
    public static void main(String[] args) {
        LibraryItem[] items = new LibraryItem[3];
        items[0] = new Book("B101", "The Alchemist", "Paulo Coelho");
        items[1] = new Magazine("M202", "Time", "Various");
        items[2] = new DVD("D303", "Inception", "Christopher Nolan");

        for (LibraryItem item : items) {
            System.out.println(item.getItemDetails());
            System.out.println("Loan Duration: " + item.getLoanDuration() + " days");
            if (item instanceof Reservable) {
                boolean available = ((Reservable) item).checkAvailability();
                System.out.println("Available: " + available);
                if (available) {
                    boolean reserved = ((Reservable) item).reserveItem("User123");
                    System.out.println("Reserved: " + reserved);
                }
            }
            System.out.println();
        }
    }
}
