package com.marcod.hotebookinglsystem.hotel_booking_system.service;

import com.marcod.hotebookinglsystem.hotel_booking_system.exception.ResourceNotFoundException;
import com.marcod.hotebookinglsystem.hotel_booking_system.model.Hotel;
import com.marcod.hotebookinglsystem.hotel_booking_system.repository.HotelRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class HotelServiceImpl implements HotelService{


    private final HotelRepository hotelRepository;


    public HotelServiceImpl(HotelRepository hotelRepository) {
        this.hotelRepository = hotelRepository;
    }

    @Override
    public Hotel save(Hotel hotel) {
        return hotelRepository.save(hotel);
    }

    @Override
    public Hotel getHotelById(long id) {
        return hotelRepository.findById(id)
                              .orElseThrow(() -> new ResourceNotFoundException("Hotel with id: " + id + " not found!"));

    }

    @Override
    public List<Hotel> getAllHotels() {
        return hotelRepository.findAll();
    }

    @Override
    public void deleteHotelById(long id) {

        if (!hotelRepository.existsById(id)) {
            throw new ResourceNotFoundException("Hotel with id: " + id + " not found!");
        }
        hotelRepository.deleteById(id);
    }

}
