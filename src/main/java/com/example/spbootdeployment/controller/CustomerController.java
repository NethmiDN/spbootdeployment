package com.example.spbootdeployment.controller;

import com.example.spbootdeployment.entity.Customer;
import com.example.spbootdeployment.service.CustomerService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/customer")
@RequiredArgsConstructor
public class CustomerController {
    private final CustomerService customerService;

    @GetMapping
    public String getCustomer() {
        return "Customer 1";
    }

    @PostMapping
    public ResponseEntity<Customer> saveCustomer(@RequestBody Customer customer){
        return ResponseEntity.ok(customerService.saveCustomer(customer));
    }
}
