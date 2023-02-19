package com.piyush.customer.dal;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.piyush.customer.dal.entities.Customer;
import com.piyush.customer.dal.repos.CustomerRepository;

@SpringBootTest
class CustomerdalApplicationTests {

	@Autowired
	private CustomerRepository repo;
	
	@Test
	void testCreateCustomer() {
		Customer customer = new Customer();
		customer.setName("Piyush");
		customer.setEmail("ps@gmail.com");
		repo.save(customer);
	}

}
