package com.sunbeam.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name="emp")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Emp {
	@Id
	private int empno;
	private String ename;
	private double sal;
	@ManyToOne
	@JoinColumn(name = "deptno")
	private Dept dept;
}
