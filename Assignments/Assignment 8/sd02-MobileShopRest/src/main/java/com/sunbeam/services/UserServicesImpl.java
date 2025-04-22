package com.sunbeam.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.sunbeam.daos.UserDao;
import com.sunbeam.entities.User;


@org.springframework.transaction.annotation.Transactional
@Service
public class UserServicesImpl implements UserServices
{
	
	
	@Autowired
	private UserDao userdao;
	
	@Override
	public List<User> getAllUsers() {		
	List<User> list = userdao.findAll();
	return list;
	}
	
	

	@Override
	public Optional<User> getUserById(int id) {		
		Optional<User> us =  userdao.findById(id);
		return us;
	}
	

	@Override
	public int addUser(User u) {		
		User us = userdao.save(u);
		if(us != null)
		return 1;
		return 0;
	}

	@Override
	public int updateUser(User u) {		
		User us = userdao.save(u);
		if(us != null)
			return 1;
		return 0;
	}
	
	

	@Override
	public int UpdateUserPass(String password,int id) {		
		int count =userdao.upadatePriceById(password, id);
		return count;
	}
	
	

	@Override
	public int DeleteById(int id) {
		
		if( userdao.existsById(id)){
			userdao.deleteById(id);
			return 1;	}
		return 0;
	}



		
	
	
	
	
	
	
	

}
