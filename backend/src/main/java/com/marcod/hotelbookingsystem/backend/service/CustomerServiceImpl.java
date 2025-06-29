package com.marcod.hotelbookingsystem.backend.service;

import com.marcod.hotelbookingsystem.backend.exception.ResourceNotFoundException;
import com.marcod.hotelbookingsystem.backend.model.Customer;
import com.marcod.hotelbookingsystem.backend.repository.CustomerRepository;
import org.springframework.stereotype.Service;

import java.util.List;

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
