package com.marcod.hotebookinglsystem.hotel_booking_system.controller;

import com.marcod.hotebookinglsystem.hotel_booking_system.model.Customer;
import com.marcod.hotebookinglsystem.hotel_booking_system.service.CustomerService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    private final CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    // Standard Methode
    // localhost:8080/api/customers
    @GetMapping
    public List<Customer> getAllCustomers () {
        return customerService.getAllCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomerById (@PathVariable("id") long id) {
        return customerService.getCustomerById(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED) // 201 No Content ist Standard für erfolgreiches Created
    public Customer save (@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomerById (@PathVariable("id") long id) {
        customerService.deleteCustomerById(id);
    }


}
