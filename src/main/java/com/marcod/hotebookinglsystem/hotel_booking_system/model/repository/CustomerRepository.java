package com.marcod.hotebookinglsystem.hotel_booking_system.model.repository;

import com.marcod.hotebookinglsystem.hotel_booking_system.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
