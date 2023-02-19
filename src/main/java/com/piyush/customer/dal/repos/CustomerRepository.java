package com.piyush.customer.dal.repos;

import org.springframework.data.repository.CrudRepository;

import com.piyush.customer.dal.entities.Customer;

public interface CustomerRepository extends CrudRepository<Customer, Long> {

}
