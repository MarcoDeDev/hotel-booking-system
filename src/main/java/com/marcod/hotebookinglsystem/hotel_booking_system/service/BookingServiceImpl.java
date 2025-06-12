package com.marcod.hotebookinglsystem.hotel_booking_system.service;

import com.marcod.hotebookinglsystem.hotel_booking_system.exception.ResourceNotFoundException;
import com.marcod.hotebookinglsystem.hotel_booking_system.model.Booking;
import com.marcod.hotebookinglsystem.hotel_booking_system.repository.BookingRepository;

import java.util.List;
import java.util.Optional;

public class BookingServiceImpl implements BookingService{

    private final BookingRepository bookingRepository;

    public BookingServiceImpl(BookingRepository bookingRepository) {
        this.bookingRepository = bookingRepository;
    }

    @Override
    public Booking save(Booking booking) {
        return bookingRepository.save(booking);
    }

    @Override
    public Booking getBookingById(long id) {
        return bookingRepository.findById(id)
                                .orElseThrow(() -> new ResourceNotFoundException("Customer with id: " + id + " not found!"));
    }

    @Override
    public List<Booking> getAllBookings() {
        return bookingRepository.findAll();
    }

    @Override
    public void deleteBookingById(long id) {

        if (!bookingRepository.existsById(id)) {
            throw new ResourceNotFoundException("Booking with id: " + id + " not found!");
        }
        bookingRepository.deleteById(id);
    }
}
