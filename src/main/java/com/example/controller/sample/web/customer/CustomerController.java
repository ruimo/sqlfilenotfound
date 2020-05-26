package com.example.controller.sample.web.customer;

import com.example.domainparts.sample.customer.CustomerService;
import com.example.domainparts.sample.customer.beans.Customer;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Customer Service rest Controller.
 */
@RestController
public class CustomerController {
  final CustomerService service;

  @Autowired
  public CustomerController(CustomerService service) {
    this.service = service;
  }

  @RequestMapping(path = "/api/customers", method = RequestMethod.GET)
  public ResponseEntity<List<Customer>> getCustomers() {
    List<Customer> list = service.getCustomers();
    return new ResponseEntity<List<Customer>>(list, HttpStatus.OK);
  }
}
