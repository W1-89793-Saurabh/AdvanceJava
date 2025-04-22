package com.sunbeam.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Table(name="emp")
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@Data
public class Emp {
	@Id
	private int empno;
	private String ename;
	private double sal;	
	private int deptno;
}
