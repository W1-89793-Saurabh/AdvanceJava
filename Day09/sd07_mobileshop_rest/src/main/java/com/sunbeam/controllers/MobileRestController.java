package com.sunbeam.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sunbeam.entities.Mobile;
import com.sunbeam.pojos.MobileForm;
import com.sunbeam.services.MobileService;

@RequestMapping("/mobiles")
@RestController
public class MobileRestController {
	@Autowired
	private MobileService mobileService;
	
	@PostMapping("")
	public ResponseUtil<?> addNewMobile(MobileForm mobileForm) throws Exception {
		Mobile mobile = mobileService.addMobile(mobileForm);
		return ResponseUtil.apiSuccess(mobile);
	}
}
