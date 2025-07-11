package com.marcod.hotelbookingsystem.backend.controller;

import com.marcod.hotelbookingsystem.backend.model.Booking;
import com.marcod.hotelbookingsystem.backend.service.BookingService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/bookings")
public class BookingController {

    private final BookingService bookingService;

    public BookingController(BookingService bookingService) {
        this.bookingService = bookingService;
    }

    // Standard Methode
    // localhost:8080/api/bookings
    @GetMapping
    public List<Booking> getAllBookings () {
        return bookingService.getAllBookings();
    }

    @GetMapping("/{id}")
    public Booking getBookingById (@PathVariable("id") long id) {
        return bookingService.getBookingById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // 201 No Content ist Standard für erfolgreiches Created
    public Booking save (@RequestBody Booking booking) {
        System.out.println("Save Booking: " + booking);
        return bookingService.save(booking);
    }

    @DeleteMapping("/{id}")
    public void deleteBookingById (@PathVariable("id") long id) {
        bookingService.deleteBookingById(id);
    }

}
