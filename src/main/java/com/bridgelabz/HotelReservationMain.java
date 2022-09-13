package com.bridgelabz;

import java.util.Scanner;

public class HotelReservationMain {
    public static void main(String[] args){
        System.out.println("Welcome to hotel reservation system");
        Scanner sc = new Scanner(System.in);
        HotelReservationService hotelReservationService = new HotelReservationService();
        hotelReservationService.addHotel(new Hotel("Lakewood", 110, 90));
        hotelReservationService.addHotel(new Hotel("Bridgewood", 150, 60));
        hotelReservationService.addHotel(new Hotel("Ridgewood", 220, 150));

        System.out.println("Enter check-in date: (dd-mm-yyyy)");
        String checkInDate = sc.nextLine();
        System.out.println("Enter check-out date: (dd-mm-yyyy)");
        String checkOutDate = sc.nextLine();
        Hotel cheapestHotel = hotelReservationService.getCheapestHotel(checkInDate, checkOutDate);
        System.out.println("Cheapest Hotel: " + cheapestHotel.getName() + ", Total Cost: " + cheapestHotel.getTotalCost()); }
}
