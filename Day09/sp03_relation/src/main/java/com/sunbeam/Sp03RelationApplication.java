package com.sunbeam;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sunbeam.controllers.ResponseUtil;
import com.sunbeam.daos.EmpDao;
import com.sunbeam.entities.Emp;

@SpringBootApplication
public class Sp03RelationApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Sp03RelationApplication.class, args);
	}
	
	@Autowired
	private EmpDao empDao;

	@Override
	public void run(String... args) throws Exception {
		findAllEmps();
		
	}

	private ResponseUtil<?> findAllEmps() {
		List<Emp> list = empDao.findAll();
		return ResponseUtil.apiSuccess(list);
	}


}
