package Inheritence;

class Book {
    String title;
    int publicationYear;

    Book(String title, int publicationYear) {
        this.title = title;
        this.publicationYear = publicationYear;
    }

    void displayInfo() {
        System.out.println("Title: " + title);
        System.out.println("Publication Year: " + publicationYear);
    }
}

class Author extends Book {
    String authorName;
    String bio;

    Author(String title, int publicationYear, String authorName, String bio) {
        super(title, publicationYear);
        this.authorName = authorName;
        this.bio = bio;
    }

    void displayInfo() {
        super.displayInfo();
        System.out.println("Author Name: " + authorName);
        System.out.println("Bio: " + bio);
    }
}

public class BookSingleInheritace {
    public static void main(String[] args) {
        Author a1 = new Author("Wings of Fire", 1999, "Dr. A.P.J. Abdul Kalam", "Former President of India, scientist, and visionary.");
        Author a2 = new Author("Harry Potter and the Philosopher's Stone", 1997, "J.K. Rowling", "British author known for the Harry Potter series.");

        a1.displayInfo();
        System.out.println();

        a2.displayInfo();
    }
}
