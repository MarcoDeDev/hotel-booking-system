package com.marcod.hotelbookingsystem.backend.repository;

import com.marcod.hotelbookingsystem.backend.model.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookingRepository extends JpaRepository<Booking, Long> {
}
