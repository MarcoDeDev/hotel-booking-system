package com.marcod.hotelbookingsystem.backend.repository;

import com.marcod.hotelbookingsystem.backend.model.Hotel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HotelRepository extends JpaRepository<Hotel, Long> {
}
