package com.example.springhibernate.orm;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface CustomerDAO {

    List<Customer> getCustomers();

    void addCustomer(Customer customer);

    void updateCustomer(Customer customer);

}
