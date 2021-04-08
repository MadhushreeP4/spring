package com.xworkz.fooddelivery.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.xworkz.fooddelivery.constant.FoodType;

import lombok.Data;

@Data
@Entity
@Table(name="FOOD")
public class FoodItemEntity {
	
	@Id
	@Column(name="ID")
	private int id;
	@Column(name="NAME")
	private String name;
	@Column(name="PRICE")
	private float price;
	@Column(name="FOOD_TYPE")
	private FoodType foodType;
	@Column(name="QUANTITY")
	private int qunatity;

	public FoodItemEntity() {
		System.out.println("created " + this.getClass().getSimpleName());
	}

	public FoodItemEntity(String name, float price, FoodType foodType, int qunatity) {
		super();
		this.name = name;
		this.price = price;
		this.foodType = foodType;
		this.qunatity = qunatity;
	}

	@Override
	public String toString() {
		return "FoodDelivaryEntity [name=" + name + ", price=" + price + ", foodType=" + foodType + ", qunatity="
				+ qunatity + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((foodType == null) ? 0 : foodType.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result + qunatity;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		FoodItemEntity other = (FoodItemEntity) obj;
		if (foodType != other.foodType)
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (qunatity != other.qunatity)
			return false;
		return true;
	}

}
