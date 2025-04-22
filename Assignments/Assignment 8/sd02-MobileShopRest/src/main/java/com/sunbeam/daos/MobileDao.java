package com.sunbeam.daos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.sunbeam.entities.Mobile;

public interface MobileDao extends JpaRepository<Mobile, Integer>{
	
	@Modifying
	@Query(value="Update Mobile  set price=?1 where id=?2")
	int updateByPrice(double price,int id);

}
