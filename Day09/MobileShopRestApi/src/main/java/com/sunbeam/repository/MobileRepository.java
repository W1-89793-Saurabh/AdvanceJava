package com.sunbeam.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;


import com.sunbeam.entities.Mobile;


public interface MobileRepository extends JpaRepository<Mobile, Integer> {

	Optional<Mobile> findByCompany(String company);

	

	
}
