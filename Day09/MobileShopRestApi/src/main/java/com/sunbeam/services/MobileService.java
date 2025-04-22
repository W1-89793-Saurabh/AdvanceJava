package com.sunbeam.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunbeam.dtos.ResponseUtil;
import com.sunbeam.entities.Mobile;
import com.sunbeam.repository.MobileRepository;

@Service
public class MobileService {

	@Autowired
	private MobileRepository mobileRepository;
	
	public ResponseUtil<?> getAllMobiles(){
		return (ResponseUtil<?>) mobileRepository.findAll();
	}
	
	public Optional<Mobile> getMobileById(int id){
		return mobileRepository.findById(id);
	}
	
	public Mobile createMobile(Mobile m){
		return mobileRepository.save(m);
	}
	
	public Optional<Mobile> updateMobile(int id, Mobile updateMobile) {
		return mobileRepository.findById(id).map(existingMobile -> { updateMobile.setId(id); return mobileRepository.save(updateMobile);});
	}
	
	public boolean deleteMobile(int id) {
		if(mobileRepository.existsById(id)) { mobileRepository.deleteById(id);
		return true;
		}
		return false;
	}
}
