package com.sunbeam;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.sunbeam.daos.DeptDao;
import com.sunbeam.entities.Dept;
import com.sunbeam.entities.Emp;

@Transactional
@SpringBootApplication
public class Sd04JparelnsApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(Sd04JparelnsApplication.class, args);
	}

	@Autowired
	private DeptDao deptDao;
	
	@Override
	public void run(String... args) throws Exception {
		//findDeptById();
		//saveDept();
		deleteDeptById();
	}

	private void deleteDeptById() {
		deptDao.deleteById(50);
	}

	private void saveDept() {	
		List<Emp> empList = new ArrayList<Emp>();
		empList.add(new Emp(1001, "NILESH", 1000.0, 50));
		empList.add(new Emp(1002, "ROHAN", 1500.0, 50));
		Dept d = new Dept(50, "TRAINING", "PUNE", empList);
		deptDao.save(d);
		System.out.println("Dept Saved.");
	}

	private void findDeptById() {
		Optional<Dept> od = deptDao.findById(10);
		if(od.isPresent()) {
			Dept d = od.get();
			System.out.println(d);
			for(Emp e : d.getEmpList())
				System.out.println(e);
		}
		else
			System.out.println("Dept not found");
	}
}
