package com.sunbeam.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sunbeam.daos.MobileDao;
import com.sunbeam.entities.Mobile;

@org.springframework.transaction.annotation.Transactional
@Service
public class MobileservicesImpl implements MobileServices {

	@Autowired
	private MobileDao mobiledao;

	@Override
	public List<Mobile> getAllMobile() {
		List<Mobile> list = mobiledao.findAll();
		return list;
	}

	
	@Override
	public Optional<Mobile> getMobileById(int id) {
		Optional<Mobile> m = mobiledao.findById(id);
		return m;
	}
	
	

	@Override
	public int addMobile(Mobile m) {
		Mobile mob = mobiledao.save(m);
		if (mob != null)
			return 1;
		return 0;
	}
	

	@Override
	public int updateMobile(Mobile m) {

		Mobile mob = mobiledao.save(m);
		if (mob != null)
			return 1;
		return 0;
	}
	

	@Override
	public int deleteById(int id) {
		if (mobiledao.existsById(id)) {
			mobiledao.deleteById(id);
			return 1;
			}
		return 0;
	}
	
	

	@Override
	public int updatePrice(double price,int id) {
		int count = mobiledao.updateByPrice(price, id);
		return count;

	}

}
