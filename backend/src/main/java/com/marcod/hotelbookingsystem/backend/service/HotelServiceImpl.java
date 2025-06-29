package com.marcod.hotelbookingsystem.backend.service;

import com.marcod.hotelbookingsystem.backend.exception.ResourceNotFoundException;
import com.marcod.hotelbookingsystem.backend.model.Hotel;
import com.marcod.hotelbookingsystem.backend.repository.HotelRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
