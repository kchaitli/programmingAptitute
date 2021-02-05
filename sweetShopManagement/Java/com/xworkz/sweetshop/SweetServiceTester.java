package com.xworkz.sweetshop;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.sweetshop.constants.Sweets;
import com.xworkz.sweetshop.dao.SweetDAO;
import com.xworkz.sweetshop.dao.SweetDAOImpl;
import com.xworkz.sweetshop.dto.SweetShopDTO;
import com.xworkz.sweetshop.validations.SweetServiceDAO;
import com.xworkz.sweetshop.validations.SweetServiceDAOImpl;

public class SweetServiceTester {
	public static void main(String[] args) {
		List<SweetShopDTO> list = new ArrayList<SweetShopDTO>();
		
		SweetDAO dao = new SweetDAOImpl(list);
		SweetServiceDAO sweetService = new SweetServiceDAOImpl(dao);
		
		SweetShopDTO dto = new SweetShopDTO();
		dto.setLocation("vidyanagar");
		dto.setShopName("sweetTooth");
		dto.setSweetType(Sweets.KAJU_KATLI);
		
		SweetShopDTO dto2 = new SweetShopDTO();
		dto2.setLocation("Shree nagar");
		dto2.setShopName("bangaloreSweets");
		dto2.setSweetType(Sweets.CHOCOLATE_BARFI);
		
		sweetService.validateAndSave(dto);
		sweetService.validateAndSaveListOfShops(list);
		sweetService.validateAndUpdateShopByLocation("Shree nagar", "sweetHub");
		sweetService.validateAndDeleteShopByName("sweetWorld");
		
	}
}
