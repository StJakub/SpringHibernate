package com.example.springhibernate.orm;

import java.util.List;

public interface CustomerService {

    List<Customer> getCustomers();
    void addCustomer(Customer customer);
}

