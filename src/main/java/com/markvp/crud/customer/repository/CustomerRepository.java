package com.markvp.crud.customer.repository;

import com.markvp.crud.customer.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {
    public Customer findCustomerByNama(String nama);
}
