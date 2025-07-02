package objectrelationship;

import java.util.ArrayList;


class Book {
 private String title;
 private String author;


 public Book(String title, String author) {
     this.title = title;
     this.author = author;
 }

 
 public void display() {
     System.out.println("Book: \"" + title + "\" by " + author);
 }
}

class Library {
 private String name;
 private ArrayList<Book> books;


 public Library(String name) {
     this.name = name;
     books = new ArrayList<>();
 }

 
 public void addBook(Book book) {
     books.add(book);
 }

 
 public void displayBooks() {
     System.out.println("Library: " + name);
     for (Book book : books) {
         book.display();
     }
     System.out.println();
 }
}


public class LibraryAggregationDemo {
 public static void main(String[] args) {
     
     Book book1 = new Book("1984", "George Orwell");
     Book book2 = new Book("The Great Gatsby", "F. Scott Fitzgerald");
     Book book3 = new Book("To Kill a Mockingbird", "Harper Lee");

    
     Library cityLibrary = new Library("City Library");
     Library schoolLibrary = new Library("School Library");

     
     cityLibrary.addBook(book1);
     cityLibrary.addBook(book2);

     schoolLibrary.addBook(book2); 
     schoolLibrary.addBook(book3);

     
     cityLibrary.displayBooks();
     schoolLibrary.displayBooks();
 }
}
