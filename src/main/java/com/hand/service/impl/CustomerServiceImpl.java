package com.hand.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.dto.Customer;
import com.hand.mapper.CustomerMapper;


public class CustomerServiceImpl {

	@Autowired
	private CustomerMapper customerMapper;
	
	public void add(Customer customer) {
		customerMapper.add(customer);
	}

	public Customer getById(Short id) {
		System.out.println("123");
		return customerMapper.getById(id);
	}

	public void save(Customer entity) {
	
	}


}
