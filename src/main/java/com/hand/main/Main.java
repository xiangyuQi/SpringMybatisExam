package com.hand.main;

import java.util.Date;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.hand.dto.Customer;
import com.hand.service.AddressService;
import com.hand.service.CustomerService;
import com.hand.service.impl.AddressServiceImpl;
import com.hand.service.impl.CustomerServiceImpl;

public class Main {

	static ApplicationContext context = new ClassPathXmlApplicationContext("com/hand/ApplicationContext.xml");

	
	public static void main(String[] args) {
		AddressService addressService = (AddressServiceImpl) context.getBean("addressService");
		CustomerService customerService = (CustomerServiceImpl)context.getBean("customerService");
		Customer c = context.getBean(Customer.class);
		System.out.println(c.getStoreId());
		Scanner sc = new Scanner(System.in);  
		System.out.println("请输入 FirstName(first_name):");
		String firstName = sc.nextLine();
		System.out.println("请输入 LastName(last_name):");
		String lastName = sc.nextLine();
		System.out.println("请输入 Email(email):email");
		String email = sc.nextLine();
		System.out.println("请输入 Address	ID:");
		Short addressId = sc.nextShort();
		while(true){
			if(addressService.getById(addressId)!=null){
				break;
			}else{
				System.out.println("你输入的 Address	ID 不存在,请重新输入:");
				addressId = sc.nextShort();
			}
		}
		Date date = new Date();
		c.setAddressId(addressId);
		c.setCreateDate(date);
		c.setEmail(email);
		c.setFirstName(firstName);
		c.setLastName(lastName);
		customerService.add(c);
		System.out.println("已经保存的数据如下:");
		Customer customer = customerService.getByCustomer(c);
		System.out.println("ID:"+customer.getCustomerId());
		System.out.println("FirstName:"+customer.getFirstName());
		System.out.println("LastName:"+customer.getLastName());
		System.out.println("Email:"+customer.getEmail());
		System.out.println("Address:"+addressService.getById(customer.getAddressId()).getAddress());
		System.out.println("请输入要删除的 Customer 的 ID:");
		Short customerId = sc.nextShort();
		if(customerService.getById(customerId)==null){
			System.out.println("您输入的ID不存在");
			return ;
		}
		customerService.deleteById(customerId);
		System.out.println("你输入的 ID 为 "+customerId+"的 Customer 已经 删除.");
	}
}
