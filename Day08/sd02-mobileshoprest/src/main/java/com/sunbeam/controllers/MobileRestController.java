package com.sunbeam.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.daos.MobileDao;
import com.sunbeam.entities.Mobile;

@CrossOrigin
@RequestMapping("/mobiles")
@RestController
public class MobileRestController {
	@Autowired
	private MobileDao mobileDao;

	@GetMapping
	public ResponseUtil<?> findAllMobiles() {
		List<Mobile> list = mobileDao.findAll();
		return ResponseUtil.apiSuccess(list);
	}

	@GetMapping("/{id}")
	public ResponseUtil<?> findMobileById(@PathVariable("id") int mobileId) {
		Optional<Mobile> om = mobileDao.findById(mobileId);
		return ResponseUtil.apiSuccess(om.get());
	}
	
	@GetMapping("/bycompany/{company}")
	public ResponseUtil<?> findCompanyMobiles(@PathVariable("company") String company) {
		List<Mobile> list = mobileDao.findByCompany(company);
		return ResponseUtil.apiSuccess(list);
	}
	
	// Homework
	// @PostMapping
	// @PutMapping
	// @DeleteMapping
	// @PatchMapping
}
