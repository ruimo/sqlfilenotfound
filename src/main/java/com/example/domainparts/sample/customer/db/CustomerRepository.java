package com.example.domainparts.sample.customer.db;

import com.example.domainparts.sample.customer.beans.Customer;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class CustomerRepository {
  private CustomerMapper mapper;

  // Constructor
  @Autowired
  public CustomerRepository(CustomerMapper mapper) {
    this.mapper = mapper;
  }

  public List<Customer> list() {
    return mapper.list();
  }
}