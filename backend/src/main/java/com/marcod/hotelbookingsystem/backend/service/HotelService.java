package com.marcod.hotelbookingsystem.backend.service;

import com.marcod.hotelbookingsystem.backend.model.Hotel;

import java.util.List;

public interface HotelService {

    Hotel save (Hotel hotel);

    Hotel getHotelById(long id);

    List<Hotel> getAllHotels();

    void deleteHotelById(long id);

}
