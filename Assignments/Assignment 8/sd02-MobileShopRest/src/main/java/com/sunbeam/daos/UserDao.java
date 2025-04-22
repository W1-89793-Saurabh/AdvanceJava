package com.sunbeam.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.sunbeam.entities.User;

public interface UserDao extends JpaRepository<User, Integer> {
	
	@Modifying
	@Query(value = "Update User set password=?1 where id=?2")
	 int upadatePriceById(String password,int id);
	
	

}
