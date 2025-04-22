package com.sunbeam.entities;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@Table(name="dept")
@Entity
@AllArgsConstructor
@RequiredArgsConstructor
@Data
@ToString(exclude = "empList")
public class Dept {
	@Id
	private int deptno;
	private String dname;
	private String loc;
	@OneToMany//(cascade=CascadeType.MERGE) //(fetch=FetchType.EAGER)
	@JoinColumn(name="deptno") // FK col in emps table
	private List<Emp> empList;
}
