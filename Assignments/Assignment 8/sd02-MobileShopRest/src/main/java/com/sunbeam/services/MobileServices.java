package com.sunbeam.services;

import java.util.List;
import java.util.Optional;
import com.sunbeam.entities.Mobile;

public interface MobileServices {
	
	List<Mobile> getAllMobile();
	
	Optional<Mobile> getMobileById(int id);	
	/*Optional<Mobile> getMobileByCompany(String company);
	Optional<Mobile> getMobileByRam(int ram);
	Optional<Mobile> getMobileByStorage(int storage);	
	List<Mobile> getAllMobileStrorageGrtThan(int storage);
	List<Mobile> getAllMobileStrorageLessThan(int storage);
	List<Mobile> getAllMobilePriceBetween(double minPrice,double MaxPrice);
	
	// find mobiles in price range with ram greater than given value in desc order of price
	
	List<Mobile> getAllMobilesInPricerangeRamGrtThanGivenValueInDescOrder(double minPrice,double maxPrice,int ram );*/
	int addMobile(Mobile m);
	int updateMobile(Mobile m);
	int deleteById(int id);
	int updatePrice(double price,int id);

}
