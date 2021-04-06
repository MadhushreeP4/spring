package com.xworkz.fooddelivery;

import com.xworkz.fooddelivery.constant.FoodType;
import com.xworkz.fooddelivery.entity.FoodItemEntity;
import com.xworkz.fooddelivery.repository.FoodItemRepo;
import com.xworkz.fooddelivery.repository.FoodItemRepoImpl;
import com.xworkz.fooddelivery.service.FoodItemService;
import com.xworkz.fooddelivery.service.FoodItemServiceImpl;

public class FoodItemTester {

	public static void main(String[] args) {
		
		FoodItemEntity entity=new FoodItemEntity("Hiderabad Biryani",25,FoodType.SOUTH_INDIAN, 2);
		FoodItemRepo repository=new FoodItemRepoImpl();
		FoodItemService service=new FoodItemServiceImpl(repository);
		service.validateAndSave(entity);

	}

}
