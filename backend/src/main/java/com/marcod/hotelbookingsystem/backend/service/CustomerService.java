package com.marcod.hotelbookingsystem.backend.service;

import com.marcod.hotelbookingsystem.backend.model.Customer;

import java.util.List;

public interface CustomerService {

    Customer save (Customer customer);

    Customer getCustomerById(long id);

    List<Customer> getAllCustomers();

    void deleteCustomerById(long id);
}
