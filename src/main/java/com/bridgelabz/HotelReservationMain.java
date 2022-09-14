package com.bridgelabz;

import java.util.Scanner;
public class HotelReservationMain {
    public static void main(String[] args){
        System.out.println("Welcome to hotel reservation system");
        Scanner sc = new Scanner(System.in);
        HotelReservationService hotelReservationService = new HotelReservationService();
        hotelReservationService.addHotel(new Hotel("Lakewood", 110, 80, 90, 80, 3));
        hotelReservationService.addHotel(new Hotel("Bridgewood", 160, 110, 60, 50, 4));
        hotelReservationService.addHotel(new Hotel("Ridgewood", 220, 100, 150, 40, 5));

        System.out.println("Enter check-in date: (dd-mm-yyyy)");
        String checkInDate = sc.nextLine();
        System.out.println("Enter check-out date: (dd-mm-yyyy)");
        String checkOutDate = sc.nextLine();
        Hotel cheapestHotel = hotelReservationService.getCheapestBestRatedHotel(checkInDate, checkOutDate, true);
        System.out.println("Cheapest Hotel: " + cheapestHotel.getName() + ", Ratings : " + cheapestHotel.getRatings() + ", Total Cost: " + cheapestHotel.getTotalCost());
    }

}
