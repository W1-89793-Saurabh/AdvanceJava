package com.sunbeam.entities;



import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Entity
@Table(name = "emp")
@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Emp {
	@Id
	private int empno;
	private String ename;
	private String job;
	private double sal;
	private Double comm;
	//@Basic // java.sql.Date
	@Temporal(TemporalType.DATE)
	private LocalDate hire;
	@ManyToOne //(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH, CascadeType.REMOVE}) //(fetch = FetchType.LAZY)
	@JoinColumn(name="deptno") // FK col name
	private Dept dept;
}
