package com.xworkz.fooddelivery.service;

import com.xworkz.fooddelivery.entity.CustomerEntity;
import com.xworkz.fooddelivery.repository.CustomerRepo;

public class CustomerServiceImpl implements CustomerService {

	private CustomerRepo customerRepo;

	public CustomerServiceImpl(CustomerRepo customerRepo) {
		System.out.println("created " + this.getClass().getSimpleName());
		this.customerRepo = customerRepo;
	}

	@Override
	public boolean validateAndPersist(CustomerEntity entity) {
		System.out.println("Invoked validateAndPersist");
		if (entity != null) {
			System.out.println("entity is not null");
			this.customerRepo.save(entity);
		}
		return false;
	}

}
