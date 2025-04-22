package com.sunbeam;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import com.sunbeam.daos.MeetingDao;
import com.sunbeam.entities.Emp;
import com.sunbeam.entities.Meeting;

@Transactional
@SpringBootApplication
public class Sd06JparelnsApplication implements CommandLineRunner {
	public static void main(String[] args) {
		SpringApplication.run(Sd06JparelnsApplication.class, args);
	}
	
	@Autowired
	private MeetingDao meetingDao;
	
	@Override
	public void run(String... args) throws Exception {
		Optional<Meeting> om = meetingDao.findById(300);
		if(om.isPresent()) {
			Meeting m = om.get();
			System.out.println(m);
			for (Emp e : m.getEmpList()) {
				System.out.println(e);
			}
		}
		else
			System.out.println();
	}
}
