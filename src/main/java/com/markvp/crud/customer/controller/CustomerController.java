package com.markvp.crud.customer.controller;

import com.markvp.crud.customer.entity.Customer;
import com.markvp.crud.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService custService;

    @PostMapping("/add-customer")
    public Customer addCustomer(@RequestBody Customer cust){
        return custService.saveCustomer(cust);
    }

    @PostMapping("/add-customers")
    public List<Customer> addCustomer(@RequestBody List<Customer> listCust){
        return custService.saveCustomers(listCust);
    }

    @GetMapping("/find-all")
    public List<Customer> findAllCustomer(){
        return custService.findAllCustomers();
    }

    @GetMapping("/find-by-id/{id}")
    public Customer findCustomerById(@PathVariable int id) throws Exception {
        return custService.findCustomerById(id);
    }

    @GetMapping("/find-by-name/{nama}")
    public Customer findCustomerByNama(@PathVariable String nama) throws Exception {
        return custService.findCustomerByNama(nama);
    }

    @PutMapping("/update-customer")
    public Customer updateCustomer(@RequestBody Customer cust){
        return custService.updateCustomer(cust);
    }

    @DeleteMapping("/delete-customer/{id}")
    public String deleteCustomer(@PathVariable int id){
        return custService.deleteCustomerById(id);
    }
}
