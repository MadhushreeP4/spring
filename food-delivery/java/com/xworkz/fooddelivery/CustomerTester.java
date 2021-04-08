package com.xworkz.fooddelivery;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.xworkz.fooddelivery.entity.CustomerEntity;
import com.xworkz.fooddelivery.repository.CustomerRepo;
import com.xworkz.fooddelivery.repository.CustomerRepoImpl;
import com.xworkz.fooddelivery.service.CustomerService;
import com.xworkz.fooddelivery.service.CustomerServiceImpl;
import com.xworkz.fooddelivery.service.FoodItemService;

public class CustomerTester {

	public static void main(String[] args) {
		
		CustomerEntity entity = new CustomerEntity("Kartik", "Gadag", 5, 678987675);
		ApplicationContext container = new ClassPathXmlApplicationContext("fd.xml");
		CustomerService service = container.getBean(CustomerService.class);
		service.validateAndPersist(entity);
	}

}
