package com.marcod.hotebookinglsystem.hotel_booking_system.service;

import com.marcod.hotebookinglsystem.hotel_booking_system.exception.ResourceNotFoundException;
import com.marcod.hotebookinglsystem.hotel_booking_system.model.Customer;
import com.marcod.hotebookinglsystem.hotel_booking_system.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{

    private final CustomerRepository customerRepository;

    public CustomerServiceImpl(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    @Override
    public Customer save(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer getCustomerById(long id) {

        return customerRepository.findById(id)
                                 .orElseThrow(() -> new ResourceNotFoundException("Customer with id: " + id + " not found!"));
    }

    @Override
    public List<Customer> getAllCustomers() {
        return customerRepository.findAll();
    }

    @Override
    public void deleteCustomerById(long id) {

        if (!customerRepository.existsById(id)) {
            throw new ResourceNotFoundException("Customer with id: " + id + " not found!");
        }
        customerRepository.deleteById(id);
    }
}
