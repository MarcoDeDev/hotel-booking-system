package com.marcod.hotelbookingsystem.backend.repository;

import com.marcod.hotelbookingsystem.backend.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
