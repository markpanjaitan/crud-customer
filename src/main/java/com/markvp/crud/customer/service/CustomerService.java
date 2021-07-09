package com.markvp.crud.customer.service;

import com.markvp.crud.customer.entity.Customer;
import com.markvp.crud.customer.repository.CustomerRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class CustomerService {

    @Autowired
    private CustomerRepository repo;

    public Customer saveCustomer(Customer cust){
        return repo.save(cust);
    }

    public List<Customer> saveCustomers(List<Customer> listCust){
        return repo.saveAll(listCust);
    }

    public List<Customer> findAllCustomers(){
        return repo.findAll();
    }

    public Customer findCustomerById(int id) throws Exception{
        return repo.getById(id);
    }

    public Customer findCustomerByNama(String nama) throws Exception{
        return repo.findCustomerByNama(nama);
    }

    public String deleteCustomerById(int id){
        repo.deleteById(id);
        return "Deleted Customer ID : " + id;
    }

    public Customer updateCustomer(Customer cust){
        //int test1 = cust.getId();
        Customer existingCustomer = repo.findById(cust.getId()).orElse(cust);
        existingCustomer.setNama(cust.getNama());
        existingCustomer.setPhone(cust.getPhone());

        return repo.save(existingCustomer);
    }
}
