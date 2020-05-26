package com.example.domainparts.sample.customer.beans;

import java.sql.Date;
import java.sql.Timestamp;

public class Customer {
  private long customerId;

  public long getCustomerId() {
    return customerId;
  }

  public void setCustomerId(long customerId) {
    this.customerId = customerId;
  }
}
