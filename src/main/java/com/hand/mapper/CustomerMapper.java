package com.hand.mapper;

import com.hand.dto.Customer;

public interface CustomerMapper {

	public void add(Customer customer);
	
	public void deleteById(Short id);
	
	public Customer getById(Short id);

	public Customer getByCustomer(Customer customer);
}
