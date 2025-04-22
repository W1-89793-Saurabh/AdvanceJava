package com.sunbeam.services;

import java.io.FileOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.util.FileCopyUtils;
import org.springframework.web.multipart.MultipartFile;

import com.sunbeam.daos.MobileDao;
import com.sunbeam.entities.Mobile;
import com.sunbeam.pojos.MobileForm;

@Service
public class MobileServiceImpl implements MobileService {
	@Autowired
	private MobileDao mobileDao;
	@Override
	public Mobile addMobile(MobileForm mf) throws Exception {
		MultipartFile image = mf.getImage();
		uploadFile(image);
		Mobile mobile = new Mobile(0, 
									mf.getName(), 
									mf.getRam(), 
									mf.getStorage(), 
									mf.getCompany(), 
									mf.getPrice(), 
									image.getOriginalFilename());
		Mobile dbMobile = mobileDao.save(mobile);
		return dbMobile;
	}
	
	@Value("${imagesFolderPath}")
	private String imagesFolderPath;
	
	public void uploadFile(MultipartFile image) throws Exception {
		String destFilePath = imagesFolderPath + "/" + image.getOriginalFilename();
		try(FileOutputStream fout = new FileOutputStream(destFilePath)) {
			FileCopyUtils.copy(image.getInputStream(), fout);
		}
	}
}
