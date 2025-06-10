package com.marcod.hotebookinglsystem.hotel_booking_system.service;

import com.marcod.hotebookinglsystem.hotel_booking_system.model.Customer;

import java.util.List;
import java.util.Optional;

public interface CustomerService {

    Customer save (Customer customer);

    Optional<Customer> getCustomerById(long id);

    List<Customer> getAllCustomers();

    void deleteCustomerById(long id);
}
