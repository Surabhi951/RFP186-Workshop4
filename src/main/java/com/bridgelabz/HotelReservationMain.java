package com.bridgelabz;

public class HotelReservationMain {
    public static void main(String[] args){
        System.out.println("Welcome to hotel reservation system");
        HotelReservationService hotelReservationService = new HotelReservationService();
        hotelReservationService.addHotel(new Hotel("Lakewood", 110));

    }
}
