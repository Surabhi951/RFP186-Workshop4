package com.bridgelabz;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
public class HotelReservationTest {
    static HotelReservationService hotelReservationService;
    @BeforeAll
    static void initialize() {
        hotelReservationService = new HotelReservationService();
        hotelReservationService.addHotel(new Hotel("Lakewood", 110, 80, 90, 80, 3));
        hotelReservationService.addHotel(new Hotel("Bridgewood", 150, 110, 60, 50, 4));
        hotelReservationService.addHotel(new Hotel("Ridgewood", 220, 100, 150, 40, 5));
    }

    @Test
    void givenHotel_ShouldBe_AddedToHotelList() {
        boolean result = hotelReservationService.addHotel(new Hotel("Lakewood", 110, 80, 90, 80, 3));
        Assertions.assertTrue(result);
    }

    @Test
    void givenCheckInAndCheckOutDates_ShouldReturn_CheapestHotel() {
        Hotel hotel = hotelReservationService.getCheapestBestRatedHotel("23-05-2022", "27-05-2022",false);
        Assertions.assertEquals("Lakewood", hotel.getName());
    }

    @Test
    void givenWeekendDates_ShouldReturn_CheapestHotel() {
        Hotel hotel = hotelReservationService.getCheapestBestRatedHotel("28-05-2022", "29-05-2022",false);
        Assertions.assertEquals("Bridgewood", hotel.getName());
    }

    @Test
    void givenDateRange_ShouldReturn_CheapestBestRatedHotel() {
        Hotel hotel = hotelReservationService.getCheapestBestRatedHotel("23-05-2022", "31-05-2022",false);
        Assertions.assertEquals("Bridgewood", hotel.getName());
    }

    @Test
    void customerShould_getBestRatedHotel() {
        Hotel hotel = hotelReservationService.getBestRatedHotel();
        Assertions.assertEquals("Ridgewood", hotel.getName());
    }

    @Test
    void givenWeekendDates_ForRewardedCustomersReturn_CheapestHotel() {
        Hotel hotel = hotelReservationService.getCheapestBestRatedHotel("28-05-2022", "29-05-2022",true);
        Assertions.assertEquals("Ridgewood", hotel.getName());
    }
}
