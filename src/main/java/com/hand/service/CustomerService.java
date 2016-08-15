package com.hand.service;

import org.springframework.stereotype.Service;

import com.hand.dto.Customer;

@Service
public interface CustomerService {
	public void add(Customer customer);
	
	public Customer getById(Short id);
	
	public void save(Customer entity);
	
	public Customer getByCustomer(Customer customer) ;
	
}
