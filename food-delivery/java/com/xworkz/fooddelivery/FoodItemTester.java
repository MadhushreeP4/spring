package com.xworkz.fooddelivery;

import com.xworkz.fooddelivery.constant.FoodType;
import com.xworkz.fooddelivery.entity.FoodItemEntity;
import com.xworkz.fooddelivery.service.FoodItemService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class FoodItemTester {

	public static void main(String[] args) {
		
		FoodItemEntity entity=new FoodItemEntity("Hiderabad Biryani",25,FoodType.SOUTH_INDIAN, 2);
		ApplicationContext container = new ClassPathXmlApplicationContext("fd.xml");
		FoodItemService service = container.getBean(FoodItemService.class);
		service.validateAndSave(entity);

	}

}
