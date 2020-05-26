package com.example.domainparts.sample.customer;

import com.example.domainparts.sample.customer.beans.Customer;
import com.example.domainparts.sample.customer.db.CustomerRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
  private CustomerRepository repository;

  @Autowired
  public CustomerService(CustomerRepository repository) {
    this.repository = repository;
  }

  public List<Customer> getCustomers() {
    return repository.list();
  }
}
