package com.xworkz.sweetshop.dto;

import com.xworkz.sweetshop.constants.Sweets;

public class SweetShopDTO {
	private String shopName;
	private String location;
	private Sweets sweetType;
	
	public SweetShopDTO() {
		
	}
	

	public SweetShopDTO(String shopName, String location, Sweets sweetType) {
		super();
		this.shopName = shopName;
		this.location = location;
		this.sweetType = sweetType;
	}


	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Sweets getSweetType() {
		return sweetType;
	}

	public void setSweetType(Sweets sweetType) {
		this.sweetType = sweetType;
	}

	@Override
	public String toString() {
		return "SweetShopDTO [shopName=" + shopName + ", location=" + location + ", sweetType=" + sweetType + "]";
	}
	
	
}
