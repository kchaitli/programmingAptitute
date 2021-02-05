package com.xworkz.sweetshop.validations;

import java.util.List;

import com.xworkz.sweetshop.dao.SweetDAO;
import com.xworkz.sweetshop.dto.SweetShopDTO;

public class SweetServiceDAOImpl implements SweetServiceDAO {

	List<SweetShopDTO> sweetShops;

	private SweetDAO sweetDAO;

	public SweetServiceDAOImpl(SweetDAO sweetDAO) {
		System.out.println("sweetServiceDao created");
		this.sweetDAO = sweetDAO;
	}

	@Override
	public boolean validateAndSave(SweetShopDTO dto) {
		boolean validData = false;
		if (dto != null) {
			System.out.println("dto is not null can validate fields");
			String shopName = dto.getShopName();
			if (shopName != null && shopName.length() >= 3 && shopName.length() <= 15) {
				System.out.println("shopName is valid");
				validData = true;
			} else {
				System.out.println("shopName not valid");
				validData = false;
			}
			if (validData) {
				String location = dto.getLocation();
				if (location != null && location.length() >= 3 && location.length() <= 15
						&& !location.contains("[^A-Za-z0-9]")) {
					System.out.println("location is valid");
					validData=true;
				}else {
					System.out.println("location not valid");
					validData=false;
				}
			}
			if(validData) {
				System.out.println("all data is valid");
				this.sweetDAO.save(dto);
				validData=true;
			}else {
				System.out.println("dto is null cannot save fields");
			}

		}
		return false;
	}

	@Override
	public boolean validateAndSaveListOfShops(List<SweetShopDTO> dtos) {
		System.out.println("invoked validateAndSaveListOfShops");
		boolean valid=false;
		if(dtos!=null && dtos.size()>0) {
			int size=dtos.size();
			int tempSize=0;
				boolean saved=sweetDAO.saveListOfShops(dtos);
				if(!saved) {
					System.out.println("dto not saved");
					valid=false;
				}else {
					System.out.println("dto saved");
					tempSize++;
				}
			if(tempSize==size) {
				valid=true;
			}
		}
		return false;
	}

	@Override
	public boolean validateAndUpdateShopByLocation(String location, String name) {
		System.out.println("invoked validateAndUpdateShopByLocation");
		if (location!=null && location.length()>=3 && location.length()<=15 && !location.contains("[^A-Za-z0-9]") && name!=null && name.length()>=3 && name.length()<=15) {
			this.sweetDAO.updateShopByLocation(location, name);
			return true;
		}else {
			System.out.println("name and location are not valid");
		}
		return false;
	}

	@Override
	public boolean validateAndDeleteShopByName(String name) {
		System.out.println("invoked validateAndDeleteShopByName");
		if(name!=null && name.length()>=3 && name.length()<=15) {
			this.sweetDAO.deleteShopByName(name);
			return true;
		}
		return false;
	}
}
