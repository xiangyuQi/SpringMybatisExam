package com.hand.service.impl;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hand.dto.Customer;
import com.hand.mapper.CustomerMapper;
import com.hand.service.CustomerService;

@Service("customerService")
@Transactional
public class CustomerServiceImpl implements CustomerService{

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

	public Customer getByCustomer(Customer customer) {
		return customerMapper.getByCustomer(customer);
	}

	public void  deleteById(Short id) {
		customerMapper.deleteById(id);
	}


}
