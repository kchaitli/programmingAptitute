package com.xworkz.sweetshop.dao;

import java.util.List;

import com.xworkz.sweetshop.dto.SweetShopDTO;

public interface SweetDAO {
	
	boolean save(SweetShopDTO dto);
	
	boolean saveListOfShops(List<SweetShopDTO> dtos);
	
	boolean updateShopByLocation(String location, String name);
	
	boolean deleteShopByName(String name);
	
	SweetShopDTO findByName(String name);
	
	List<SweetShopDTO> getAll();
	
	
}
