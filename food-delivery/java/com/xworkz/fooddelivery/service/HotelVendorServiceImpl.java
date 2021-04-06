package com.xworkz.fooddelivery.service;

import com.xworkz.fooddelivery.entity.HotelVendorEntity;
import com.xworkz.fooddelivery.repository.HotelVendorRepo;

public class HotelVendorServiceImpl implements HotelVendorService {

	private HotelVendorRepo hotelVendorRepo;
	
	public HotelVendorServiceImpl(HotelVendorRepo hotelVendorRepo) {
		System.out.println("created "+this.getClass().getSimpleName());
		this.hotelVendorRepo=hotelVendorRepo;
	}

	@Override
	public boolean ValidateAndSave(HotelVendorEntity entity) {
		System.out.println("Invoked save");
		if(entity!=null) {
			System.out.println("entity is not null");
			this.hotelVendorRepo.save(entity);
		}
		return false;
	}
}
