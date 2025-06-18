package com.booking.main;

import com.booking.model.TravelService;
import com.booking.service.BookingService;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        BookingService bookingService = new BookingService();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n--- Travel Booking System ---");
            System.out.println("1. Book Flight");
            System.out.println("2. Book Hotel");
            System.out.println("3. Book Transport");
            System.out.println("4. Show All Bookings");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int choice = scanner.nextInt();
            scanner.nextLine(); // clear buffer
            
            if (choice == 5) break;

            System.out.print("Enter Destination: ");
            String destination = scanner.nextLine();
            System.out.print("Enter Price: ");
            double price = scanner.nextDouble();

            switch (choice) {
                case 1:
                    bookingService.bookService(new TravelService("Flight", destination, price));
                    break;
                case 2:
                    bookingService.bookService(new TravelService("Hotel", destination, price));
                    break;
                case 3:
                    bookingService.bookService(new TravelService("Transport", destination, price));
                    break;
                case 4:
                    bookingService.showAllBookings();
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        }
        scanner.close();
    }
}
