package com.hand.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hand.dto.Address;
import com.hand.mapper.AddressMapper;
import com.hand.service.AddressService;


@Service("addressService")
@Transactional
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressMapper addressMapper;
	
	public Address getById(Short id) {
		return addressMapper.getById(id);
	}

}
