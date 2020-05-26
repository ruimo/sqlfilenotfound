package com.example.domainparts.sample.customer.db;

import java.sql.JDBCType;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CustomerSupport {
  public static final CustomerTable customer = new CustomerTable();
  public static final SqlColumn<Long> customerId = customer.customerId;

  public static final class CustomerTable extends SqlTable {
    public final SqlColumn<Long> customerId = column("customer_id", JDBCType.INTEGER);

    public CustomerTable() {
      super("customer");
    }
  }
}
