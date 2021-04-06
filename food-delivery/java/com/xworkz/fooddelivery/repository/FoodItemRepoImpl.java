package com.xworkz.fooddelivery.repository;

import com.xworkz.fooddelivery.entity.FoodItemEntity;

public class FoodItemRepoImpl implements FoodItemRepo {
	
	public FoodItemRepoImpl() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	@Override
	public void save(FoodItemEntity entity) {
		System.out.println("Invoked save");
		System.out.println("Implmentation using JPA");
		
	}

}
