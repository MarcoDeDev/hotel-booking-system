package com.marcod.hotelbookingsystem.backend.service;

import com.marcod.hotelbookingsystem.backend.model.Booking;

import java.util.List;

public interface BookingService {

    Booking save (Booking booking);

    Booking getBookingById(long id);

    List<Booking> getAllBookings();

    void deleteBookingById(long id);
}
