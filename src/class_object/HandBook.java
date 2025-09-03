package class_object;

import java.util.Scanner;

public class HandBook {
    String bookTitle;
    String bookAuthor;
    double price;

    HandBook(String bookTitle, String bookAuthor, double price) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.price = price;
    }

    public void displayBookDetails() {
        System.out.println("Title of the book: " + bookTitle);
        System.out.println("Author of the book: " + bookAuthor);
        System.out.println("Price of the book: " + price);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter book title: ");
        String title = sc.nextLine();
        System.out.print("Enter book author: ");
        String author = sc.nextLine();
        System.out.print("Enter book price: ");
        double price = sc.nextDouble();

        HandBook book = new HandBook(title, author, price);
        book.displayBookDetails();
    }
}