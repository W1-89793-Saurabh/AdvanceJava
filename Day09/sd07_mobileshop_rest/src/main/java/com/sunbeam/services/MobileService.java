package com.sunbeam.services;

import com.sunbeam.entities.Mobile;
import com.sunbeam.pojos.MobileForm;

public interface MobileService {
	Mobile addMobile(MobileForm mobileForm) throws Exception;
}
