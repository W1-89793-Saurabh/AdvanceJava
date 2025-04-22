package com.sunbeam;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.sunbeam.daos.EmpDao;
import com.sunbeam.entities.Dept;
import com.sunbeam.entities.Emp;

@SpringBootApplication
public class SpringRelationshipApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringRelationshipApplication.class, args);
	}
	
	@Autowired
	private EmpDao empDao;

	@Override
	public void run(String... args) throws Exception {
//		findAllEmps();
//		findEmpById();
//		saveEmp();
		updateEmp();
//				removeEmp();
	}
	


	
	private void updateEmp() {
		empDao.		
	}




	private void saveEmp() {
		Dept d = new Dept(50, "TRAINING", "PUNE");
		Emp e = new Emp(1000, "NILESH", "TEACHER", 1000.0, null, LocalDate.parse("2004-05-31"), d);
		empDao.save(e);
		System.out.println("Emp Saved.");
	}


	private void findEmpById() {
		int empno = 7900;
		Optional<Emp> optEmp = empDao.findById(empno);
		if(optEmp.isPresent()) {
			System.out.println("Emp found.");
			Emp emp = optEmp.get();
			System.out.println(emp.getEname());
			System.out.println(emp.getSal());
			System.out.println(emp.getHire());
			System.out.println(emp.getDept());
		}
		else
			System.out.println("Emp not found");
	}


	private void findAllEmps() {
		List<Emp> list = empDao.findAll();
		for (Emp emp : list) {
			System.out.println(emp);
		}

	}
}
