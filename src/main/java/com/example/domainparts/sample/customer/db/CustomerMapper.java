package com.example.domainparts.sample.customer.db;

import com.example.domainparts.sample.customer.beans.Customer;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.scripting.thymeleaf.support.TemplateFilePathProvider;

@Mapper
public interface CustomerMapper {
  @SelectProvider(type = TemplateFilePathProvider.class)
  @Results(id = "CustomerResult", value = {
      @Result(column = "customer_id", property = "customerId", jdbcType = JdbcType.BIGINT, id = true)
  })
  public List<Customer> list();
}
