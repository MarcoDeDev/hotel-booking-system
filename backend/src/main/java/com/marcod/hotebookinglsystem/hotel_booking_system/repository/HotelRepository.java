package com.marcod.hotebookinglsystem.hotel_booking_system.repository;

import com.marcod.hotebookinglsystem.hotel_booking_system.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
