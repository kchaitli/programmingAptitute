package com.xworkz.sweetshop.validations;

import java.util.List;

import com.xworkz.sweetshop.dto.SweetShopDTO;

public interface SweetServiceDAO {
	boolean validateAndSave(SweetShopDTO dto);
	
	boolean validateAndSaveListOfShops(List<SweetShopDTO>dtos);
	
	boolean validateAndUpdateShopByLocation(String location, String name);
	
	boolean validateAndDeleteShopByName(String name);
}
