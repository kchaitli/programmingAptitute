package com.xworkz.sweetshop.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import com.xworkz.sweetshop.dto.SweetShopDTO;

public class SweetDAOImpl implements SweetDAO {
	//save one obj, save list of obj, udate details, getAll, findByName
	List<SweetShopDTO> sweets;
	
	public SweetDAOImpl(){
		this.sweets= new ArrayList<SweetShopDTO>();
	}
	
	public SweetDAOImpl(List<SweetShopDTO> list) {
		this.sweets=list;
		System.out.println("created SweetDAOImpl");
	}

	@Override
	public boolean save(SweetShopDTO dto) {
		boolean added = false;
		System.out.println("invoked save method in dao");
		boolean contains = this.sweets.contains(dto);

		if (!contains) {
			added = this.sweets.add(dto);
		}
		if (added) {
			System.out.println("sweetdto added");
			System.out.println(sweets);
		}
		else
			System.out.println("sweetdto not added");
		return false;
	}

	@Override
	public boolean saveListOfShops(List<SweetShopDTO> dtos) {
		if(dtos!=null) {
			boolean added=dtos.addAll(sweets);
			System.out.println("multiple data added "+added);
			System.out.println(dtos);
			return true;
		}
		return false;
	}

	@Override
	public boolean updateShopByLocation(String location, String name) {
		System.out.println("invoked updateNameByLocation");
		for(SweetShopDTO shopDTO : sweets) {
			String shopName=shopDTO.getShopName();
			if(location!=null && location.equals(location)) {
				System.out.println("shop location found can update name");
				shopDTO.setShopName(name);
				System.out.println("update name "+shopDTO);
				System.out.println(sweets);
				return true;
			}else {
				System.out.println("shop not found");
			}
		}
		System.out.println("no elements in list");
		return false;
	}

	@Override
	public boolean deleteShopByName(String name) {
		System.out.println("invoked deleteShopByName");
		Iterator<SweetShopDTO> iterator = this.sweets.iterator();
		while(iterator.hasNext()) {
			SweetShopDTO dto = iterator.next();
			if(dto.getShopName().equals(name)) {
				System.out.println("name found can delete");
				iterator.remove();
				System.out.println("name deleted"+dto);
				System.out.println(sweets);
				return true;
			}else {
				System.out.println("name not match");
			}
		}
		return false;
	}

	@Override
	public List<SweetShopDTO> getAll() {
		return this.sweets;
	}

	@Override
	public SweetShopDTO findByName(String name) {
		System.out.println("invoked find by name");
		System.out.println("name: "+name);
		for (SweetShopDTO sweetShopDTO : sweets) {
			String sweetFromDTO = sweetShopDTO.getShopName();
			if(sweetFromDTO.equals(name)) {
				System.out.println("shop by name found");
				return sweetShopDTO;
			}
		}
		return null;
	}
	

}
