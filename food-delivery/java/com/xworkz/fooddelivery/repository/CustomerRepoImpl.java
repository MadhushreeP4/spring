package com.xworkz.fooddelivery.repository;

import com.xworkz.fooddelivery.entity.CustomerEntity;

public class CustomerRepoImpl implements CustomerRepo {
	
	public CustomerRepoImpl() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public void save(CustomerEntity entity) {
		System.out.println("Invoked save");
		System.out.println("Implmentation using JPA");
	}

}
