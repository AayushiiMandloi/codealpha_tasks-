package com.booking.service;

import com.booking.model.TravelService;
import java.util.ArrayList;
import java.util.List;

public class BookingService {
	private List<TravelService> bookings = new ArrayList<>();

    public void bookService(TravelService service) {
        bookings.add(service);
        System.out.println("Booked: " + service);
    }

    public void showAllBookings() {
        System.out.println("\nYour Bookings:");
        for (TravelService service : bookings) {
            System.out.println(service);
        }
    }
}
