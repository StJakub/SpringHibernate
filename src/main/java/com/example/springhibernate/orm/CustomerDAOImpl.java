package com.example.springhibernate.orm;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.Query;

import java.util.List;

@Repository
public class CustomerDAOImpl implements CustomerDAO{

    private final SessionFactory sessionFactory;

    @Autowired
    public CustomerDAOImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public List<Customer> getCustomers() {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("from Customer", Customer.class);
        return query.getResultList();
    }

    @Override
    public void addCustomer(Customer customer) {
        Session session = sessionFactory.getCurrentSession();
        session.save(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        Session session = sessionFactory.getCurrentSession();
    }


}
