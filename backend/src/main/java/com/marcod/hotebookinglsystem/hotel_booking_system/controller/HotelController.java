package com.marcod.hotebookinglsystem.hotel_booking_system.controller;

import com.marcod.hotebookinglsystem.hotel_booking_system.model.Hotel;
import com.marcod.hotebookinglsystem.hotel_booking_system.service.HotelService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/hotels")
public class HotelController {

    private final HotelService hotelService;

    public HotelController(HotelService hotelService) {
        this.hotelService = hotelService;
    }

    // Standard Methode
    // localhost:8080/api/hotels
    @GetMapping
    public List<Hotel> getAllHotels () {
        return hotelService.getAllHotels();
    }

    @GetMapping("/{id}")
    public Hotel getHotelByHotel (@PathVariable("id") long id) {
        return hotelService.getHotelById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // 201 No Content ist Standard für erfolgreiches Created
    public Hotel save (@RequestBody Hotel hotel) {
        System.out.println(("Save Hotel: " + hotel));
        return hotelService.save(hotel);
    }

    @DeleteMapping("/{id}")
    public void deleteHotelById (@PathVariable("id") long id) {
        hotelService.deleteHotelById(id);
    }


}
