package com.example;

import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Spring boot start up class.
 */
@SpringBootApplication
public class Application {
  /**
   * run application.
   * @param args not use.
   */
  public static void main(String[] args) {
    ApplicationContext ctx = SpringApplication.run(Application.class, args);

    String[] beanNames = ctx.getBeanDefinitionNames();
    Arrays.sort(beanNames);
    System.err.println("List beans provided by Spring Boot:");
    Arrays.stream(beanNames).forEach(beanName -> System.err.println(beanName));
  }
}
