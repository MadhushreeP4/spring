package com.xworkz.fooddelivery;

import com.xworkz.fooddelivery.constant.HotelType;
import com.xworkz.fooddelivery.entity.HotelVendorEntity;
import com.xworkz.fooddelivery.repository.HotelVendorRepo;
import com.xworkz.fooddelivery.repository.HotelVendorRepoImpl;
import com.xworkz.fooddelivery.service.HotelVendorService;
import com.xworkz.fooddelivery.service.HotelVendorServiceImpl;

public class HotelVendorTester {

	public static void main(String[] args) {

		HotelVendorEntity entity = new HotelVendorEntity("Niyaz", "Hubli", 10, HotelType.FAMILY);

		HotelVendorRepo repo = new HotelVendorRepoImpl();
		HotelVendorService service = new HotelVendorServiceImpl(repo);
		service.ValidateAndSave(entity);

	}

}
