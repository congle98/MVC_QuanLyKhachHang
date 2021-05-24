package com.app.service;

import com.app.models.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findALl();
    void save(Customer customer);
    Customer findById(int id);
    void update(int id,Customer customer);
    void remove(int id);

}
