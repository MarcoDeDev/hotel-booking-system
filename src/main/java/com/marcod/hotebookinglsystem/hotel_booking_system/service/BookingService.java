package com.marcod.hotebookinglsystem.hotel_booking_system.service;

import com.marcod.hotebookinglsystem.hotel_booking_system.model.Booking;

import java.util.List;
import java.util.Optional;

public interface BookingService {

    Booking save (Booking booking);

    Optional<Booking> getBookingById(long id);

    List<Booking> getAllBookings();

    void deleteBookingById(long id);
}
