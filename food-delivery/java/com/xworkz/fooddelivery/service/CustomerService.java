package com.xworkz.fooddelivery.service;

import com.xworkz.fooddelivery.entity.CustomerEntity;

public interface CustomerService {
	
	boolean validateAndPersist(CustomerEntity entity);

}
