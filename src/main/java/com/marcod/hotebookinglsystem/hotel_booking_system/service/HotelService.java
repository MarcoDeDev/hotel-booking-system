package com.marcod.hotebookinglsystem.hotel_booking_system.service;

import com.marcod.hotebookinglsystem.hotel_booking_system.model.Hotel;
import com.marcod.hotebookinglsystem.hotel_booking_system.model.Room;

import java.util.List;
import java.util.Optional;

public interface HotelService {

    Hotel save (Hotel hotel);

    Optional<Hotel> getHotelById(long id);

    List<Hotel> getAllHotels();

    void deleteHotelById(long id);

}
