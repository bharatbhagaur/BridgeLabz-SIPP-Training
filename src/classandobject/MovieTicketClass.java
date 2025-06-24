package classandobject;

import java.util.Scanner;

class MovieTicket {
    String movieName;
    int seatNumber;
    double price;

    void bookTicket(String movieName, int seatNumber, double price) {
        this.movieName = movieName;
        this.seatNumber = seatNumber;
        this.price = price;
        System.out.println("Ticket booked successfully.");
    }

    void displayTicket() {
        System.out.println("----- Ticket Details -----");
        System.out.println("Movie Name: " + movieName);
        System.out.println("Seat Number: " + seatNumber);
        System.out.println("Price: ₹" + price);
    }
}

public class MovieTicketClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MovieTicket ticket = new MovieTicket();

        System.out.print("Enter Movie Name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter Seat Number: ");
        int seatNumber = sc.nextInt();

        System.out.print("Enter Ticket Price: ");
        double price = sc.nextDouble();

        ticket.bookTicket(movieName, seatNumber, price);
        System.out.println();
        ticket.displayTicket();
    }
}
