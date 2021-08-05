package de.meldanor.exampleapi.repositories;

import de.meldanor.exampleapi.models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> { }
