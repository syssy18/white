package com.cgi.paris.fs.comex.white.core.service;

import com.cgi.paris.fs.comex.white.core.bean.Customer;
import com.cgi.paris.fs.comex.white.core.jpa.entity.CustomerEntity;
import com.cgi.paris.fs.comex.white.core.jpa.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public Customer create(final Customer customer) {
        return this.toCustomer(
                this.customerRepository.save(
                        this.toCustomerEntity(customer)));
    }

    public List<Customer> findAll() {
        final List<Customer> customers = new ArrayList<>();
        this.customerRepository.findAll().forEach(customerEntity -> customers.add(this.toCustomer(customerEntity)));
        return customers;
    }

    public Optional<Customer> find(final Long id) {
        return this.customerRepository.findById(id).map(this::toCustomer);
    }

    public Optional<Customer> delete(final Long id) {
        return this.customerRepository
                .findById(id)
                .map(customerEntity -> {
                    this.customerRepository.delete(customerEntity);
                    return customerEntity;
                })
                .map(this::toCustomer);
    }

    public Optional<Customer> update(final Long id, final Customer customer) {
        return this.customerRepository.findById(id)
                .map(customerEntity -> {
                    this.update(customerEntity, customer);
                    return this.customerRepository.save(customerEntity);
                })
                .map(this::toCustomer);
    }

    private Customer toCustomer(final CustomerEntity customerEntity) {
        final Customer customer = new Customer();
        customer.setId(customerEntity.getId());
        customer.setFirstName(customerEntity.getFirstName());
        customer.setLastName(customerEntity.getLastName());
        return customer;
    }

    private CustomerEntity toCustomerEntity(final Customer customer) {
        final CustomerEntity customerEntity = new CustomerEntity();
        this.update(customerEntity, customer);
        return customerEntity;
    }

    private void update(final CustomerEntity customerEntity, final Customer customer) {
        customerEntity.setFirstName(customer.getFirstName());
        customerEntity.setLastName(customer.getLastName());
    }

}
