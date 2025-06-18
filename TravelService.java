package com.booking.model;

public class TravelService {
	private String serviceType;
    private String destination;
    private double price;

    public TravelService(String serviceType, String destination, double price) {
        this.serviceType = serviceType;
        this.destination = destination;
        this.price = price;
    }

    public String getServiceType() { return serviceType; }
    public String getDestination() { return destination; }
    public double getPrice() { return price; }

    @Override
    public String toString() {
        return "Service: " + serviceType + ", Destination: " + destination + ", Price: $" + price;
    }
}
