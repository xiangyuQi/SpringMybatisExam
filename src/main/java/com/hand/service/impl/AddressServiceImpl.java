package com.hand.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hand.mapper.AddressMapper;


public class AddressServiceImpl {

	@Autowired
	private AddressMapper addressMapper;
	
	public Short getById(Short id) {
		if( addressMapper.getById(id) ==null){
			return -1;
		}else return 1;
	}

}
