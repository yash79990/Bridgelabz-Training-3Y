package class_object;

import java.util.Scanner;

public class MovieTicket {
    private String movieName;
    private String seatNumber;
    private double price;
    private boolean isBooked;

    MovieTicket(String movieName) {
        this.movieName = movieName;
        this.seatNumber = "Null";
        this.price = 0;
        this.isBooked = false;
    }

    public void bookTicket(String seatNumber, double price) {
        if (isBooked) System.out.println("Ticket already booked!");
        else {
            this.seatNumber = seatNumber;
            this.price = price;
            isBooked = true;
            System.out.println("Ticket booked successfully!");
        }
    }

    public void displayTicket() {
        if (isBooked) {
            System.out.println("Movie: " + movieName);
            System.out.println("Seat: " + seatNumber);
            System.out.println("Price: " + price);
        } else System.out.println("Ticket not booked yet.");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter movie name: ");
        String movie = sc.nextLine();
        MovieTicket ticket = new MovieTicket(movie);

        ticket.displayTicket();

        System.out.print("Enter seat number to book: ");
        String seat = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();

        ticket.bookTicket(seat, price);
        ticket.displayTicket();
    }
}