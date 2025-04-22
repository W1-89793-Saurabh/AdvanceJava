package com.sunbeam;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.sunbeam.daos.DeptDao;
import com.sunbeam.daos.EmpDao;
import com.sunbeam.entities.Dept;
import com.sunbeam.entities.Emp;

@Transactional
@SpringBootApplication
public class Sd05JparelnsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Sd05JparelnsApplication.class, args);
	}

	@Autowired
	private DeptDao deptDao;
	@Autowired
	private EmpDao empDao;
	
	@Override
	public void run(String... args) throws Exception {
		// test one to many
		Optional<Dept> od = deptDao.findById(10);
		if(od.isPresent()) {
			Dept d = od.get();
			System.out.println(d);
			for (Emp e : d.getEmpList()) {
				System.out.println(e);
			}
		}
		else
			System.out.println("Dept not found");
	
		// test many to one
		Optional<Emp> oe = empDao.findById(7900);
		if(oe.isPresent()) {
			Emp e = oe.get(); 
			System.out.println(e);
			
			// display all emps in JAMES's dept
			System.out.println("All emps in JAMES dept: ");
			Dept d = e.getDept();
			for(Emp de : d.getEmpList())
				System.out.println(de);
		}
		else
			System.out.println("Emp not found");
	}
}
