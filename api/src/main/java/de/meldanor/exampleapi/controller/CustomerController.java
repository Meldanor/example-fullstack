package de.meldanor.exampleapi.controller;

import de.meldanor.exampleapi.models.Customer;
import de.meldanor.exampleapi.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;
import java.util.Objects;

@RestController
@RequestMapping("customer")
public class CustomerController {

    @Autowired
    private CustomerRepository customerRepository;

    @PostMapping("/")
    public Customer create(@RequestBody Map<String, Object> body) {
        Customer customer = new Customer();
        customer.setFirstName(Objects.toString(body.get("firstName")));
        customer.setLastName(Objects.toString(body.get("lastName")));
        return customerRepository.save(customer);
    }

}
