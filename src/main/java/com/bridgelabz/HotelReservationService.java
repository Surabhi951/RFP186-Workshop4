package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationService {
    List<Hotel> hotelList = new ArrayList<>();

    boolean addHotel(Hotel hotel){
        hotelList.add(hotel);
        return true;
    }
}
