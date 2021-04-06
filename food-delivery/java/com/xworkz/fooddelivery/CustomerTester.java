package com.xworkz.fooddelivery;

import com.xworkz.fooddelivery.entity.CustomerEntity;
import com.xworkz.fooddelivery.repository.CustomerRepo;
import com.xworkz.fooddelivery.repository.CustomerRepoImpl;
import com.xworkz.fooddelivery.service.CustomerService;
import com.xworkz.fooddelivery.service.CustomerServiceImpl;

public class CustomerTester {

	public static void main(String[] args) {
		
		CustomerEntity entity = new CustomerEntity("Kartik", "Gadag", 5, 678987675);
		CustomerRepo repo = new CustomerRepoImpl();
		CustomerService service = new CustomerServiceImpl(repo);
		service.validateAndPersist(entity);

	}

}
