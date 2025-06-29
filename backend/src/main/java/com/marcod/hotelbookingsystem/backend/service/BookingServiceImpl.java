package com.marcod.hotelbookingsystem.backend.service;

import com.marcod.hotelbookingsystem.backend.exception.ResourceNotFoundException;
import com.marcod.hotelbookingsystem.backend.model.Booking;
import com.marcod.hotelbookingsystem.backend.repository.BookingRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
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
