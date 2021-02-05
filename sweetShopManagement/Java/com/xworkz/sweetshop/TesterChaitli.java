package com.xworkz.sweetshop;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.sweetshop.constants.Sweets;
import com.xworkz.sweetshop.dao.SweetDAO;
import com.xworkz.sweetshop.dao.SweetDAOImpl;
import com.xworkz.sweetshop.dto.SweetShopDTO;

public class TesterChaitli {

	public static void main(String[] args) {
		List<SweetShopDTO> list = new ArrayList<SweetShopDTO>();
		
		SweetDAO dao = new SweetDAOImpl(list);
		
		SweetShopDTO dto = new SweetShopDTO("maharaja", "rajajinagar", Sweets.CHOCOLATE_BARFI);
		
		dao.save(dto);
		
		SweetShopDTO dto2 = new SweetShopDTO("ABC","bangalore road",Sweets.CYCLE_KOVA);
		
		dao.save(dto2);
		
		dao.saveListOfShops(list);
		
		dao.updateShopByLocation("rajajinagar", "sweetWorld");
		
		dao.deleteShopByName("sweetWorld");
		
		dao.findByName("ABC");
		
		dao.getAll();
		
		
	}

}
