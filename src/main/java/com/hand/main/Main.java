package com.hand.main;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.dto.Address;
import com.hand.dto.Customer;
import com.hand.service.AddressService;
import com.hand.service.CustomerService;
import com.hand.service.impl.AddressServiceImpl;
import com.hand.service.impl.CustomerServiceImpl;

public class Main {

	static ApplicationContext context = new ClassPathXmlApplicationContext("com/hand/ApplicationContext.xml");

	static CustomerServiceImpl customerService = context.getBean(CustomerServiceImpl.class);

	static AddressServiceImpl addressService = context.getBean(AddressServiceImpl.class);

	public static void main(String[] args) {
	addressService.getById((short)1);
		Customer c = context.getBean(Customer.class);
		System.out.println(c.getStoreId());
		Scanner sc = new Scanner(System.in);  
		System.out.println("请输入 FirstName(first_name):");
		String fistName = sc.nextLine();
		System.out.println("请输入 LastName(last_name):");
		String lastName = sc.nextLine();
		System.out.println("请输入 Email(email):email");
		String email = sc.nextLine();
		System.out.println("请输入 Address	ID:");
		Short addressId = sc.nextShort();
		while(true){
			addressService.getById((short)1);
			if(addressService.getById(addressId)>0){
				break;
			}else{
				System.out.println("你输入的 Address	ID 不存在,请重新输入:");
				addressId = sc.nextShort();
			}
		}
		
	}
}
